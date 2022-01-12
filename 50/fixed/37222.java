public boolean isBodyReceived() {
    if (!(isHeaderReceived())) {
        return false;
    }
    if (null == (header)) {
        return false;
    }
    return (header.getBodyLength()) == (receivedBodyByteLength);
}