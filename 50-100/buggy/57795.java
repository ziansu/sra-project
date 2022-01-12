@java.lang.Override
public void unload() {
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