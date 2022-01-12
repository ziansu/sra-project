public void post(java.lang.String message, java.io.File image, poster.FacebookResponse response) {
    try {
        this.image = new java.io.FileInputStream(image);
    } catch (java.io.FileNotFoundException e) {
        finish(false);
    }
    this.imageName = image.getName();
    post(message, response);
}