private workshop.pages.MutablePicoContainer getContainerFromProperties(workshop.pages.ComponentFactory behavior) {
    workshop.pages.MutablePicoContainer container = null;
    try {
        java.lang.Class c = java.lang.Class.forName(java.lang.System.getProperty("container"));
        java.lang.reflect.Constructor cons = c.getConstructor(workshop.pages.ComponentFactory.class);
        container = ((workshop.pages.MutablePicoContainer) (cons.newInstance(behavior)));
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
        container = new workshop.pages.DefaultPicoContainer(behavior);
    }
    return container;
}