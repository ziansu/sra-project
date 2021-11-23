private void setImageDetails(java.lang.String imageTheme, java.lang.String imageHeight, java.lang.String imageWidth, org.atlasapi.media.entity.Image existingImage) {
    existingImage.setMimeType(MimeType.IMAGE_PNG);
    existingImage.setType(ImageType.LOGO);
    existingImage.setColor(ImageColor.COLOR);
    existingImage.setTheme(org.atlasapi.media.entity.ImageTheme.valueOf(imageTheme.toUpperCase()));
    existingImage.setWidth(java.lang.Integer.valueOf(imageWidth));
    existingImage.setHeight(java.lang.Integer.valueOf(imageHeight));
}