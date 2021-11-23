@java.lang.Override
public ua.artcode.model.response.RunResults runMain(ua.artcode.model.ExternalCode code) throws java.lang.Exception {
    java.lang.String path = courseIOUtils.saveExternalCodeLocally(code.getSourceCode());
    java.lang.String sourcesRoot = ua.artcode.utils.StringUtils.getClassRootFromClassPath(path, java.io.File.separator);
    ua.artcode.model.response.RunResults runResults = runCore.run(new java.lang.String[]{ sourcesRoot }, new java.lang.String[]{ path }, new java.lang.String[]{  }, PreProcessors.singleClass, MethodCheckers.main, Runners.main, ResultsProcessors.main);
    org.apache.tomcat.util.http.fileupload.FileUtils.deleteDirectory(new java.io.File(pathForExternalCode));
    return runResults;
}