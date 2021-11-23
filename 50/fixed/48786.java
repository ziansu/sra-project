private int moveCursor(int count) throws com.github.fastxml.exception.ParseException {
    cursor += count;
    return read(cursor);
}