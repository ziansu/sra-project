private java.lang.String getMimeType(java.lang.String fileName) {
    java.lang.String[] fileNameSplit = org.apache.commons.lang.StringUtils.split(fileName, '.');
    return pt.webdetails.cpf.utils.MimeTypes.getMimeType(fileNameSplit[((fileNameSplit.length) - 1)].toUpperCase());
}