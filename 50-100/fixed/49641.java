@java.lang.Override
public com.laifeng.sopcastsdk.entity.Frame takeFrame() {
    if ((mFrameBuffer) == null) {
        return null;
    }
    com.laifeng.sopcastsdk.entity.Frame frame = null;
    try {
        frame = mFrameBuffer.take();
        mOutFrameCount.getAndIncrement();
        mTotalFrameCount.getAndDecrement();
    } catch (java.lang.InterruptedException e) {
    }
    return frame;
}