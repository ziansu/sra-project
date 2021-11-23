public int getProgress() {
    if ((link.getSize()) > 0) {
        return isComplete() ? 100 : ((int) (((bytesReceived) * 100) / (link.getSize())));
    }else {
        return 0;
    }
}