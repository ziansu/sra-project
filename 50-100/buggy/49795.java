private static java.lang.String getFileType(java.io.File _file) {
    java.lang.String filename = _file.getName();
    java.lang.String extension = filename.substring(((filename.lastIndexOf(".")) + 1));
    switch (extension.toLowerCase()) {
        case ".png" :
            return "image/png";
        case ".jpg" :
            return "image/jpeg";
        case ".gif" :
            return "image/gif";
        case ".bmp" :
            return "image/bmp";
        case ".csv" :
            return "application/vnd.ms-excel";
        case ".txt" :
            return "text/plain";
        case ".xlsx" :
            return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    }
    return "text/plain";
}