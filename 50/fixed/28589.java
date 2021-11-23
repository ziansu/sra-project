@java.lang.Override
public void add(int n) {
    values[size()] = n;
    (size)++;
    if ((size()) == (values.length)) {
        resize();
    }
}