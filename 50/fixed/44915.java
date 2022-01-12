public static play.modules.cmscore.ui.RenderedLeaf getPage(java.lang.String uuid) {
    try {
        return controllers.cmscore.CoreLoader.loadAndDecoratePage(uuid, 0);
    } catch (listeners.PageNotFoundException e) {
        return controllers.cmscore.CoreLoader.loadAndDecoratePageNotFoundPage();
    }
}