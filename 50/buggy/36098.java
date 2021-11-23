public java.lang.Long getTransferRate() {
    long kB = (bytesTransferred) / 1024;
    long secs = (transferTime) / 1000;
    return secs > 0.0 ? kB / secs : 0L;
}