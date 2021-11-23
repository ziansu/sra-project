public static void createDownsampleImage(int digitKey) {
    java.io.File svsFile = new java.io.File((("E:\\HE_TMA\\" + digitKey) + ".svs"));
    if (svsFile.exists()) {
        return ;
    }
    extractcores.ImageProcessor imageProcessor = new extractcores.ImageProcessor();
    java.awt.image.BufferedImage dsImage = imageProcessor.downsampleImage("E:\\HE_TMA\\", (digitKey + ".svs"), DefaultConfigValues.DOWNSAMPLE_FACTOR_X, DefaultConfigValues.DOWNSAMPLE_FACTOR_Y);
    imageProcessor.writeImage(dsImage, DefaultConfigValues.FILE_PATH_DOWNSAMPLE, (digitKey + "-ds.png"));
    java.lang.System.out.println((digitKey + ": Created downsampled image."));
}