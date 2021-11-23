private void createImage(java.lang.Long recipeID) {
    try {
        byte[] img = java.nio.file.Files.readAllBytes(config.getInputImage(recipeID).toPath());
        java.io.FileOutputStream outputStream = new java.io.FileOutputStream(config.getOutputImage(recipeID));
        outputStream.write(img);
        outputStream.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}