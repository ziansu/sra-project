public leap.web.api.meta.MApiPathBuilder getPath(java.lang.String pathTemplate) {
    leap.web.api.meta.Args.notEmpty(pathTemplate, "path template");
    return paths.get(pathTemplate);
}