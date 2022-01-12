public int getProgress() {
    if ((getSize()) > 0) {
        return isComplete() ? 100 : ((int) (((bytesReceived) * 100) / (getSize())));
    }else {
        return 0;
    }
}