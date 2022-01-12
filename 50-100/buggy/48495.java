@java.lang.Override
public final int column(long pos) {
    int count = 0;
    for (long p = pos - 1; p >= 0; p--) {
        if ((this.byteAt(pos)) == '\n') {
            break;
        }
        count++;
    }
    return count;
}