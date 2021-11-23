@java.lang.Override
public final long linecolumn(long pos) {
    byteAt(pos);
    int offset = ((int) (pos - (this.buffer_offset)));
    int count = 0;
    int i = offset;
    while ((this.buffer[i]) != '\n') {
        i--;
        count++;
    } 
    return count;
}