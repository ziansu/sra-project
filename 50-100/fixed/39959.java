public static int getUserIDFromString(java.lang.String path) {
    if (path.contains(java.io.File.separator)) {
        java.lang.String ret = path.substring(((path.lastIndexOf(java.io.File.separator)) + 1), path.lastIndexOf('.'));
        return java.lang.Integer.parseInt(ret);
    }else {
        if (!(java.lang.Character.isDigit(path.charAt(0)))) {
            return -1;
        }
        return java.lang.Integer.parseInt(path.substring(0, path.indexOf('.')));
    }
}