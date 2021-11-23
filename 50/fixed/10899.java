public void nextMainImage() {
    if ((this.neighborGenerator) == null) {
        this.initGenerator();
        return ;
    }
    (this.mainImageID)++;
    this.neighborGenerator.setMainImage(this.mainImageID);
}