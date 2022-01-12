private static play.modules.cmscore.ui.RenderedLeaf loadAndDecorateStartPage() {
    models.cmscore.Settings settings = models.cmscore.Settings.load();
    java.lang.String startPage = settings.getValue(SettingsKeys.Core.START_PAGE);
    controllers.cmscore.CoreLoader.LOG.debug((("Loading Start Page [" + startPage) + "]"));
    return controllers.cmscore.CoreLoader.loadAndDecoratePage(startPage);
}