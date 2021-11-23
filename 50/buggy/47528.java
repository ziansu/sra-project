public static void close() {
    scondor.util.Window.cleanUp();
    scondor.render.RenderMaster.close();
    scondor.Loader.close();
}