private static java.lang.String prepareMessage(java.lang.String messageCode) {
    if ((messageCode == null) || (messageCode.isEmpty())) {
        return "nowe orzeczenie";
    }
    java.lang.String message;
    if ((java.lang.Integer.parseInt(messageCode)) > 4) {
        message = "nowych orzeczeń";
    }else
        if ((java.lang.Integer.parseInt(messageCode)) > 1) {
            message = "nowe orzeczenia";
        }else {
            message = "nowe orzeczenie";
        }
    
    return message;
}