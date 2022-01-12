public java.lang.Float getWy() throws java.io.IOException {
    digilib.image.ImageJobDescription.logger.debug("get_paramWY()");
    if ((paramWY) == null) {
        paramWY = getAsFloat("wy");
        if (hasOption("pxarea")) {
            digilib.util.ImageSize imgSize = getHiresSize();
            paramWY = (paramWY) / (imgSize.getHeight());
        }
    }
    return paramWY;
}