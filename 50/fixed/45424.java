private java.util.List<hu.qgears.opengl.commons.container.OpenGLAppContainer> getCopyOfContainers() {
    synchronized(this) {
        if ((copyOfContainers) == null) {
            copyOfContainers = new java.util.ArrayList<hu.qgears.opengl.commons.container.OpenGLAppContainer>(containers);
        }
        return copyOfContainers;
    }
}