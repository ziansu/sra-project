@java.lang.Override
public int read() throws java.io.IOException {
    if ((pos) <= (end)) {
        (pos)++;
        return in.read();
    }else {
        return -1;
    }
}