public ninja.Result getUploadTemplateForm() {
    java.util.List<java.lang.String> repos = repositoryService.getRepositories();
    return ninja.Results.html().template("views/_popup-add-tpl.ftl").render("repos", repos);
}