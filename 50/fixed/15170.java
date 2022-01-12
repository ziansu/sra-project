public void setPathAlt(java.lang.String pathAlt) {
    if (pathAlt != null) {
        this.pathAlt = pathAlt.replaceFirst("pool", "zerorating");
    }else {
        this.pathAlt = null;
    }
}