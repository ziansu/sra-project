public java.util.ArrayList<com.xceptance.xlt.ai.image.FastBitmap> scanFolderForChanges(java.lang.String path) {
    java.util.ArrayList<com.xceptance.xlt.ai.image.FastBitmap> result = new java.util.ArrayList<>();
    java.io.File[] list = com.xceptance.xlt.ai.util.Helper.scanFolder(path);
    for (java.io.File element : list) {
        result.add(com.xceptance.xlt.ai.util.Helper.loadImageScaled_FastBitmap(element.getAbsolutePath(), Constants.IMAGE_HEIGHT, Constants.IMAGE_WIDTH));
    }
    return result;
}