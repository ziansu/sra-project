public ninja.Result deleteTemplate(@ninja.params.PathParam(value = "id")
java.lang.String id, ninja.session.FlashScope flashScope) {
    try {
        ai.subut.kurjun.metadata.common.subutai.TemplateId tid = IdValidators.Template.validate(id);
        templateManagerService.delete(tid);
        flashScope.success("Template removed successfully");
    } catch (java.lang.Exception e) {
        ai.subut.kurjun.web.controllers.TemplateController.LOGGER.error(("Failed to remove template: " + (e.getMessage())));
        flashScope.error("Failed to remove template.");
    }
    return ninja.Results.redirect("/");
}