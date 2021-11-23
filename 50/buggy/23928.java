@java.lang.Override
public void run() {
    AppMain.stuffRendererIndependent.imageLoader.flushCache();
    view.renderer = AppMain.system.rendererFromMap(view.map);
    view.renderer.imageLoader.flushCache();
    view.reinitLayerVis();
}