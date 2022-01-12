public void post(java.lang.String message, java.io.File image, poster.FacebookResponse response) {
    try {
        if (image != null) {
            this.image = new java.io.FileInputStream(image);
            this.imageName = image.getName();
        }
    } catch (java.io.FileNotFoundException e) {
        finish(false);
    }
    post(message, response);
}