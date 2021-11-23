public void setCacheDir(java.lang.String cacheDir) {
    if (org.apache.commons.lang3.StringUtils.isBlank(cacheDir)) {
        this.cacheDir = "";
    }else {
        this.cacheDir = cacheDir;
    }
}