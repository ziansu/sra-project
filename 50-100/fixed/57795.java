@java.lang.Override
public void unload() {
    if ((world) == null) {
        loaded = false;
        return ;
    }
    java.io.File folder = world.getWorldFolder();
    server.unloadWorld(world, true);
    loaded = false;
    try {
        org.apache.commons.io.FileUtils.deleteDirectory(folder);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        ml.svterraflops.plugins.mcballpaint.arenas.AbstractArena.deleteDir(folder);
    }
}