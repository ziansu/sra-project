public java.lang.String explode(java.lang.String str) {
    if ((str.length()) < 2) {
        return str;
    }else {
        java.lang.String buffer = "";
        for (int i = 0; i < (str.length()); i++) {
            buffer = (buffer + (str.substring(i, (i + 1)))) + " ";
        }
        buffer = buffer.trim();
        return buffer;
    }
}