public void testSaveFile() throws java.lang.Exception {
    java.lang.String imgName = "img/text.png";
    java.io.File imgFile = generalutils.FileUtils.loadFile(imgName);
    imgFile.setReadable(true);
    imgFile.setWritable(true);
    imgFile.setExecutable(true);
    java.lang.System.setProperty("upload.location", "/");
    java.io.InputStream in = new java.io.FileInputStream(imgFile);
    api.controller.ImageUploadController.saveFile(in, "text.png");
}