public java.awt.image.BufferedImage getImage() throws java.io.IOException {
    int columnOffset = 0;
    int rowOffset = 0;
    javax.imageio.ImageReadParam imageParam = reader.getDefaultReadParam();
    imageParam.setSourceSubsampling(getColumnSamplePeriod(), getRowSamplePeriod(), columnOffset, rowOffset);
    return reader.read(imageIndex, imageParam);
}