public java.io.File getThumbnailFile() {
    java.lang.String imageName = new java.text.SimpleDateFormat("ddMMyyy_HHmmss").format(new java.util.Date());
    java.io.File fullSizeImage = new java.io.File(com.example.iansangines.appnimals.ImageFileController.thumbnailDir, (("_thumbnail" + imageName) + ".jpg"));
    return fullSizeImage;
}