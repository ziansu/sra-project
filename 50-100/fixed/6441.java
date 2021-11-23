private java.util.Optional<org.atlasapi.media.entity.Image> checkForExistingImage(java.util.Set<org.atlasapi.media.entity.Image> images, java.lang.String imageTheme) {
    for (org.atlasapi.media.entity.Image image : images) {
        if (image.getTheme().getName().equals(imageTheme.toLowerCase())) {
            return java.util.Optional.of(image);
        }
    }
    return java.util.Optional.empty();
}