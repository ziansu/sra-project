@java.lang.Override
protected org.payn.chsm.processors.ControllerHolon loadController() throws java.lang.Exception {
    org.payn.chsm.io.xmltools.ElementProcessor procElem = documentConfig.getProcessorElement();
    if (procElem != null) {
        java.lang.String classPath = procElem.getClassPath();
        if (!(classPath.equals(""))) {
            return ((org.payn.chsm.processors.ControllerHolon) (org.payn.chsm.io.ModelLoader.createObjectInstance(procElem.getFile(pathRoot), classPath, java.lang.String.format("Controller %s", classPath))));
        }
    }
    return null;
}