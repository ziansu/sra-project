public void setTimeStamp(long timeStamp) {
    if ((this.timeStamp) != 0) {
        throw new java.lang.IllegalStateException("timeStamp has been already set for this event.");
    }else {
        this.timeStamp = timeStamp;
    }
}