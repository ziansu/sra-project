public void nextMainImage() {
    if ((this.neighborGenerator) == null) {
        this.initGenerator();
    }
    (this.mainImageID)++;
    this.neighborGenerator.setMainImage(this.mainImageID);
}