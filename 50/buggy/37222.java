public boolean isBodyReceived() {
    if (!(isHeaderReceived())) {
        return false;
    }
    return (header.getBodyLength()) == (receivedBodyByteLength);
}