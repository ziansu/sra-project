public leap.web.api.meta.MApiPathBuilder getPath(java.lang.String pathTemplate) {
    leap.web.api.meta.Args.notEmpty(pathTemplate, "path template");
    java.lang.String relativePath = leap.web.api.meta.Strings.removeStart(pathTemplate, basePath);
    return paths.get(relativePath);
}