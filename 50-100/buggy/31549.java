public void updateDiskState() {
    if ((startBufferingTimeOnDisk) == 0) {
        startBufferingTimeOnDisk = java.lang.System.currentTimeMillis();
    }
    if ((((tuplesCountOnDisk) > (maxTuplesOnDisk)) || ((tuplesSizeOnDisk) > (maxBufferSizeOnDisk))) || (((java.lang.System.currentTimeMillis()) - (startBufferingTimeOnDisk)) > (maxBufferingTimeOnDisk))) {
        saturated = true;
    }
}