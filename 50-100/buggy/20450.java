public void remove(hu.qgears.opengl.commons.container.OpenGLAppContainer openGLAppContainer) {
    openGLAppContainer.setActive(false);
    synchronized(this) {
        containers = new java.util.ArrayList<hu.qgears.opengl.commons.container.OpenGLAppContainer>(containers);
        containers.remove(openGLAppContainer);
        copyOfContainers = null;
        if ((current) == openGLAppContainer) {
            current = null;
            nextApplication();
        }
    }
}