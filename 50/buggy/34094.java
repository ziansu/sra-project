@java.lang.Override
public int getTileSizeX() {
    int width = metadataRetrieve.getPixelsSizeX(getSeries()).getValue();
    return width;
}