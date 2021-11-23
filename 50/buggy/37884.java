public static java.lang.String gettMimeTypeName(HTTPMessage.MimeType type) {
    switch (type) {
        case appJson :
            return "application/json";
        case textPlain :
            return "text/plain";
        case imageJpeg :
            return "image/jpeg";
        case imagePng :
            return "image/png";
        case Unknown :
        default :
            return "application/unknown";
    }
}