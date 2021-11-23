public static boolean isImage(java.lang.String extension) {
    if ((extension == null) || (extension.equals("")))
        return false;
    
    extension = extension.toLowerCase();
    switch (extension) {
        case "jpg" :
        case "jpeg" :
        case "png" :
        case "gif" :
        case "bmp" :
            return true;
        default :
            return false;
    }
}