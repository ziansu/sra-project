public boolean update() {
    boolean hasPathway = false;
    if ((desktop.getSwingEngine().getEngine().getActivePathway()) != null) {
        hasPathway = true;
    }
    return hasPathway;
}