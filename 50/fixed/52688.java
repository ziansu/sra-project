public java.util.List<java.lang.String> executeJavaFileStyle(java.util.List<java.lang.String> textJavacode, java.lang.String configClasspath) {
    this.manualJavacode = textJavacode;
    this.configClasspath = configClasspath;
    this.isJavaFileStyle = true;
    return process();
}