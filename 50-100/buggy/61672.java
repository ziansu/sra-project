public static net.pms.dlna.DLNAImageProfile parseThumbRequest(java.lang.String fileName) {
    if (fileName.startsWith("thumbnail0000")) {
        fileName = fileName.substring(13);
        return net.pms.image.ImagesUtil.parseImageRequest(fileName, DLNAImageProfile.JPEG_TN);
    }else {
        net.pms.image.ImagesUtil.LOGGER.warn("Could not parse thumbnail DLNAImageProfile from \"{}\"");
        return net.pms.dlna.DLNAImageProfile.JPEG_TN;
    }
}