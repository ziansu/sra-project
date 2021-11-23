private void cleanup() {
    if ((overworldSystem) != null)
        tr.getDefaultGrid().blockingRemoveBranch(overworldSystem);
    
    displayHandler.setDisplayMode(emptyMode);
    tr.secondaryRenderer.get().getCamera().setRootGrid(null);
}