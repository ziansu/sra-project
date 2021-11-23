private void cleanup() {
    displayHandler.setDisplayMode(emptyMode);
    tr.secondaryRenderer.get().getCamera().setRootGrid(null);
}