public java.lang.String parseUploadPicture(java.lang.String html) throws tk.djcrazy.libCC98.exception.ParseContentException {
    return tk.djcrazy.libCC98.util.RegexUtil.getMatchedString(CC98ParseRepository.UPLOAD_PIC_ADDRESS_REGEX, html);
}