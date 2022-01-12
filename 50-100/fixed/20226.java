public int getHeaderSize() {
    int size = 0;
    for (int i = 2; i < 11; i++) {
        byte[] value = getValue(i);
        if (value != null) {
            size += (value.length) + (de.slackspace.openkeepass.domain.KeePassHeader.SIZE_OF_FIELD_LENGTH_BUFFER);
        }
    }
    size += getEndOfHeader().length;
    return size;
}