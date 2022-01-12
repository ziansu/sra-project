@java.lang.Override
public com.hska.localgram.model.Image getImageByFileNameAndUser(java.lang.String fileName, com.hska.localgram.model.AppUser user) {
    java.util.List<com.hska.localgram.model.Image> images = getImages();
    for (com.hska.localgram.model.Image image : images) {
        if (image.getFile_name().equals(fileName)) {
            return image;
        }
    }
    return null;
}