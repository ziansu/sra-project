public void detectPattern(java.lang.String[] args, java.util.List<gui.DesignPatternInstance> instances) {
    this.instances = instances;
    findSeedComposites();
    decorateComponents();
    getClassesInPattern();
    identifyPatternClasses();
}