private workshop.pages.ComponentFactory getBehaviorFromProperties() {
    workshop.pages.ComponentFactory behavior = null;
    try {
        java.lang.Class c = java.lang.Class.forName(java.lang.System.getProperty("container.behavior"));
        java.lang.reflect.Constructor cons = c.getConstructor();
        behavior = ((workshop.pages.ComponentFactory) (cons.newInstance()));
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
        behavior = new workshop.pages.Caching();
    }
    return behavior;
}