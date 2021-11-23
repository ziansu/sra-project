public void notifyWritten() {
    if (!(writing.get()))
        return ;
    
    if ((length) == (writtenLength.addAndGet(((lastPacket) != null ? lastPacket.length : 0)))) {
        finishWriting();
    }else {
        _writePacket();
    }
}