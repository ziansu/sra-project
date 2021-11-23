public void hide() {
    hides = true;
    for (int i = 0; i < (this.planes); i++) {
        this.originalCol.set(i, java.awt.Color.WHITE);
    }
}