private java.lang.String[] toArray(java.lang.String data) {
    if (data.startsWith("[")) {
        data = data.substring(1, ((data.length()) - 1));
        return com.sun.javafx.Utils.split(data, "|");
    }else {
        return new java.lang.String[]{ data };
    }
}