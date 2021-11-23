@controllers.With(value = actions.DefaultProjectCheckAction.class)
public static controllers.Result ajaxRequest(java.lang.String userName, java.lang.String projectName, java.lang.String path) throws java.lang.Exception {
    playRepository.PlayRepository repository = playRepository.RepositoryService.getRepository(userName, projectName);
    com.fasterxml.jackson.databind.node.ObjectNode fileInfo = repository.getMetaDataFromPath(path);
    path = utils.HttpUtil.decodePathSegment(path);
    if (fileInfo != null) {
        return ok(fileInfo);
    }else {
        return notFound();
    }
}