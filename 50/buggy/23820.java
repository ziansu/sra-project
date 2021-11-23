private static java.lang.String errorMessage(java.lang.String message, java.lang.Object[] params) {
    return (params.length) > 0 ? java.lang.String.format(java.lang.String.format(message, params)) : message;
}