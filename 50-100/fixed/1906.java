@java.lang.Override
public void write(com.koushikdutta.async.ByteBufferList bb) {
    assert !(mEnded);
    if (!(mHasWritten))
        initFirstWrite();
    
    if ((bb.remaining()) == 0)
        return ;
    
    if ((mSink) == null)
        return ;
    
    mSink.write(bb);
}