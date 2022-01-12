@java.lang.Override
public void call6(int x, org.jctools.channels.proxy.CustomType[] y, org.jctools.channels.proxy.CustomType... z) {
    long wOffset = org.jctools.channels.proxy.ProxyChannelFactory.writeAcquireWithWaitStrategy(this, waitStrategy);
    long arrayReferenceBaseIndex = this.producerReferenceArrayIndex();
    UnsafeAccess.UNSAFE.putInt((wOffset + 4), x);
    this.writeReference(arrayReferenceBaseIndex, y);
    this.writeReference((arrayReferenceBaseIndex + 1), z);
    this.writeRelease(wOffset, 6);
}