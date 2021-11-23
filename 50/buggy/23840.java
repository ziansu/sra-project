private java.lang.String getMessage(java.lang.String message) {
    java.lang.String[] sign = message.split(",");
    return (sign.length) > 1 ? sign[1] : "";
}