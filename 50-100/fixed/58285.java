private void saveCurrentTextures() throws java.io.FileNotFoundException {
    javaxt.io.Directory srcDic = new javaxt.io.Directory(((minecraftFolder.getAbsolutePath()) + (STUDENT1_DIR)));
    javaxt.io.Directory texturesDic = new javaxt.io.Directory(((minecraftFolder.getAbsolutePath()) + (STUDENT_TEXTURES_DIR)));
    javaxt[] currentTextures = srcDic.getFiles("*.png", true);
    for (int i = 0; i < (currentTextures.length); i++) {
        currentTextures[i].copyTo(texturesDic, false);
    }
}