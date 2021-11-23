public void setSteps(int steps, boolean generateGradientMap) {
    this.steps = steps;
    if (generateGradientMap) {
        java.lang.System.out.println("test");
        generateGradientMap();
    }
}