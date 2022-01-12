public java.lang.String getColor() {
    if ((color) != null) {
        return color.replaceAll("\\|", "/");
    }else {
        return null;
    }
}