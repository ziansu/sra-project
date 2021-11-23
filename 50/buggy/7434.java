public void dispose() {
    this.atlas.dispose();
    this.stage.dispose();
    if (!(this.refreash)) {
        this.bg.stop();
        this.bg.dispose();
    }
}