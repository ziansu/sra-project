public void renderTemplate(java.util.Map<java.lang.String, java.lang.Object> args) throws play.template2.exceptions.GTRuntimeException, play.template2.exceptions.GTTemplateNotFoundWithSourceInfo {
    play.template2.GTJavaBase.layoutData.set(new java.util.HashMap<java.lang.Object, java.lang.Object>());
    allOuts.clear();
    initNewOut();
    play.template2.legacy.GTContentRendererFakeClosure.initRendering();
    extendsTemplateLocation = null;
    extendedTemplate = null;
    extendingTemplate = null;
    internalRenderTemplate(args, null);
}