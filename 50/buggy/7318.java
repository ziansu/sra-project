@java.lang.Override
public int getTileSizeY() {
    int height = metadataRetrieve.getPixelsSizeY(getSeries()).getValue();
    return height;
}