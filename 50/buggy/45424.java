private java.util.List<hu.qgears.opengl.commons.container.OpenGLAppContainer> getCopyOfContainers() {
    java.util.List<hu.qgears.opengl.commons.container.OpenGLAppContainer> ret = copyOfContainers;
    if (ret == null) {
        synchronized(this) {
            copyOfContainers = new java.util.ArrayList<hu.qgears.opengl.commons.container.OpenGLAppContainer>(containers);
            ret = copyOfContainers;
        }
    }
    return ret;
}