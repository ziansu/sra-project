@java.lang.Override
public int read(byte[] buffer, int offset, int length) throws java.io.IOException {
    if ((!(allowExpire)) && ((offset + length) > (limit))) {
        setLimit(((offset + length) + (limitIncrement)));
    }
    int count = in.read(buffer, offset, length);
    if (count != (-1)) {
        this.offset += count;
    }
    return count;
}