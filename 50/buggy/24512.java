public void run() {
    try {
        fuseIntegration.mount(mountPoint);
    } catch (net.fusejna.FuseException e) {
        java.lang.System.out.println("Failed to mount the fuse file system.");
        ch.uzh.csg.p2p.group_1.DWARFS.LOGGER.error("Failed to mount the fuse file system.");
        e.printStackTrace();
    }
}