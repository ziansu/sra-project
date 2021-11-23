public boolean isMinify() {
    java.lang.String minifyString = ((java.lang.String) (this.container.getRequest().getProperty("minify")));
    if (minifyString != null) {
        return java.lang.Boolean.valueOf(minifyString);
    }
    return this.properties.getProperty("debug.minify", true);
}