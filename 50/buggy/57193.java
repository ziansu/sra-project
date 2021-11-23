public java.lang.String prepareHtmlImgSrc(byte[] avatar) {
    return (org.jtalks.jcommune.service.nontransactional.ImageUtils.HTML_SRC_TAG_PREFIX) + (base64Wrapper.encodeB64Bytes(avatar));
}