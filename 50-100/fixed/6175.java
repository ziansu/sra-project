public final void mount(final java.io.File mountPoint, final boolean blocking) throws java.lang.UnsatisfiedLinkError, net.fusejna.FuseException {
    mountLock.lock();
    if (isMounted()) {
        throw new java.lang.IllegalStateException((((getFuseName()) + " is already mounted at ") + (this.mountPoint)));
    }
    this.mountPoint = mountPoint;
    mountLock.unlock();
    net.fusejna.FuseJna.mount(this, mountPoint, blocking);
    onMount(mountPoint);
}