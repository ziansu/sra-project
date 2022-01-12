public ninja.Result downloadTemplate(@ai.subut.kurjun.web.security.AuthorizedUser
ai.subut.kurjun.model.identity.UserSession userSession, @ninja.params.PathParam(value = "id")
java.lang.String id) {
    try {
        ai.subut.kurjun.metadata.common.subutai.TemplateId tid = IdValidators.Template.validate(id);
        ninja.Renderable renderable = templateManagerService.renderableTemplate(tid.getOwnerFprint(), tid.getMd5(), false);
        return new ninja.Result(200).render(renderable).supportedContentType(Result.APPLICATION_OCTET_STREAM);
    } catch (java.io.IOException e) {
        ai.subut.kurjun.web.controllers.TemplateController.LOGGER.error(("Failed to download template: " + (e.getMessage())));
        return ninja.Results.internalServerError();
    }
}