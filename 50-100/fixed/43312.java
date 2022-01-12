@java.lang.Override
public void call5(org.jctools.channels.proxy.CustomType x, int y, org.jctools.channels.proxy.CustomType z) {
    long wOffset = org.jctools.channels.proxy.ProxyChannelFactory.writeAcquireWithWaitStrategy(this, waitStrategy);
    long arrayReferenceBaseIndex = this.producerReferenceArrayIndex(wOffset);
    this.writeReference(arrayReferenceBaseIndex, x);
    UnsafeAccess.UNSAFE.putInt((wOffset + 4), y);
    this.writeReference((arrayReferenceBaseIndex + 1), z);
    this.writeRelease(wOffset, 5);
}