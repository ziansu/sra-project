@java.lang.Override
public int read() throws java.io.IOException {
    int c;
    do {
        c = components.get(currentComponentIdx).read();
        if (c != (-1)) {
            return c;
        }else {
            ++(currentComponentIdx);
        }
    } while ((currentComponentIdx) < (components.size()) );
    return -1;
}