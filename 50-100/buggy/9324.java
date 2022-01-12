public static java.lang.String apiMimeTypeToNetworkMimeType(java.lang.String apiMimeType) {
    if (apiMimeType.startsWith(MimeType.GEOLOC_MESSAGE)) {
        return com.gsma.rcs.core.ims.service.im.chat.geoloc.GeolocInfoDocument.MIME_TYPE;
    }else
        if (com.gsma.rcs.core.ims.service.im.chat.ChatUtils.isTextPlainType(apiMimeType)) {
            return com.gsma.services.rcs.chat.ChatLog.Message.MimeType.TEXT_MESSAGE;
        }else
            if (apiMimeType.startsWith(FileTransferHttpInfoDocument.MIME_TYPE)) {
                return com.gsma.rcs.core.ims.service.im.filetransfer.http.FileTransferHttpInfoDocument.MIME_TYPE;
            }
        
    
    throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder("Unsupported input mimetype detected : ").append(apiMimeType).toString());
}