public void notifyWritten() {
    if (!(writing.get()))
        return ;
    
    if ((length) == (writtenLength.addAndGet(lastPacket.length))) {
        finishWriting();
    }else {
        _writePacket();
    }
}