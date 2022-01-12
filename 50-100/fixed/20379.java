com.taozeyu.calico.generator.RequireListReader getLayoutRequireListReader() throws java.io.IOException {
    java.io.File layoutFile = getFileByRequireInfo("layout.html");
    if (!(requireInfoHasNoError(layoutFile))) {
        layoutFile = getFileByRequireInfo("/layout.html");
    }
    if (requireInfoHasNoError(layoutFile)) {
        return new com.taozeyu.calico.generator.RequireListReader(null, layoutFile, routeDir);
    }
    return null;
}