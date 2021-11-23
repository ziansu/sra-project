@java.lang.Override
public void add(int n) {
    if ((size()) == (values.length)) {
        resize();
    }
    values[size()] = n;
    (size)++;
}