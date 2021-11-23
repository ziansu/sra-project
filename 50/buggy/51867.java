public boolean update() {
    boolean hasPathway = false;
    if ((desktop.getSwingEngine().getEngine().getActivePathway()) != null) {
        hasPathway = true;
    }
    java.lang.System.out.println(hasPathway);
    return hasPathway;
}