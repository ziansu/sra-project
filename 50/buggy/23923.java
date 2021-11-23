public static models.Image create(java.lang.String name, java.io.File img, java.lang.Long projectId) {
    models.Image image = new models.Image(name, img, projectId);
    image.save();
    return image;
}