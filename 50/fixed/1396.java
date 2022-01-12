protected void endSimulation() {
    this.editDisplayed.set(true);
    this.scene.setRoot(this.editPane);
    this.editPane.onEditorTabChange();
}