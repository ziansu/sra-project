public long getFID() throws com.v2soft.styxlib.library.exceptions.StyxException, java.io.IOException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
    if ((mFID) == (com.v2soft.styxlib.library.messages.base.StyxMessage.NOFID))
        sendWalkMessage(mPath);
    
    return mFID;
}