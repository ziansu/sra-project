@java.lang.Override
public void run() {
    int y = getGlobalId(0);
    int x = getGlobalId(1);
    float sum = 0;
    for (int i = 0; i < (size_$constant$); i++) {
        sum += (a[((y * (size_$constant$)) + i)]) * (b[((x * (size_$constant$)) + i)]);
    }
    result[((y * (size_$constant$)) + x)] = sum;
}