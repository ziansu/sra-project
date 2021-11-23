@java.lang.Override
public int[] getData(util.datastructure.PixelFormat format) throws util.datastructure.ImageException {
    assert loaded;
    switch (format) {
        case RGB :
            return img.getRGB(0, 0, img.getWidth(), img.getHeight(), null, 0, 0);
            break;
        default :
            throw new util.datastructure.ImageException("Unsupported image format.");
    }
    return null;
}