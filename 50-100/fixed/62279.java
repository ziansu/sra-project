@java.lang.Override
public int read() throws java.io.IOException {
    int c;
    while ((currentComponentIdx) < (components.size())) {
        c = components.get(currentComponentIdx).read();
        if (c != (-1)) {
            return c;
        }else {
            (currentComponentIdx)++;
        }
    } 
    return -1;
}