protected void notPressed() {
    if (killOnRelease) {
        stop();
    }
    super.notPressed();
}