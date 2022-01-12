public void appendInt(int content) {
    if ((header) < ((capacity) - 4)) {
        buffer.putInt(header, content);
        updateSize(4);
    }else {
        appendShort(((short) (content >> 16)));
        appendShort(((short) (content)));
    }
}