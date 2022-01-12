@java.lang.Override
public void write(com.koushikdutta.async.ByteBufferList bb) {
    if ((bb.remaining()) == 0)
        return ;
    
    assert !(mEnded);
    if (!(mHasWritten)) {
        initFirstWrite();
        return ;
    }
    if ((mSink) == null) {
        java.lang.System.out.println("poop squat");
        return ;
    }
    mSink.write(bb);
}