@java.lang.Override
public void call4(java.lang.Object x, org.jctools.channels.proxy.CustomType y) {
    long wOffset = org.jctools.channels.proxy.ProxyChannelFactory.writeAcquireWithWaitStrategy(this, waitStrategy);
    long arrayReferenceBaseIndex = this.producerReferenceArrayIndex();
    this.writeReference(arrayReferenceBaseIndex, x);
    this.writeReference((arrayReferenceBaseIndex + 1), y);
    this.writeRelease(wOffset, 4);
}