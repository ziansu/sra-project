public void setPath(java.lang.String path) {
    if (path != null) {
        this.path = path.replaceFirst("pool", "zerorating");
    }else {
        this.path = null;
    }
}