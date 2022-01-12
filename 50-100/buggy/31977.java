private void loadClasses() {
    for (java.lang.String name : unloadedClass) {
        try {
            prepareClass(java.lang.Class.forName(name));
        } catch (java.lang.Exception e) {
            ARModContainer.log.warn("Can not load class {}, maybe a SideOnly class.", name);
        } catch (java.lang.Throwable e) {
            ARModContainer.log.fatal("Error on loading class {}. Please check the implementation.", name);
            e.printStackTrace();
            java.lang.System.exit((-1));
        }
    }
    unloadedClass.clear();
}