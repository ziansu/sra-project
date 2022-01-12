@java.lang.Override
protected org.payn.chsm.io.ModelBuilder loadBuilder() throws java.lang.Exception {
    org.payn.chsm.io.xmltools.ElementBuilder builderElem = documentConfig.getBuilderElement();
    java.lang.String classPath = builderElem.getClassPath();
    if (!(classPath.equals(""))) {
        return ((org.payn.chsm.io.ModelBuilder) (org.payn.chsm.io.ModelLoader.createObjectInstance(getClass().getClassLoader(), builderElem.getFile(pathRoot), classPath, java.lang.String.format("Builder %s", classPath))));
    }else {
        return null;
    }
}