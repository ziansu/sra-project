public boolean isSelected(com.ln.images.models.LocalMedia image) {
    for (com.ln.images.models.LocalMedia media : selectImages) {
        if (media.getPath().equals(image.getPath())) {
            return true;
        }
    }
    return false;
}