private void parseClassJavaName() {
    int returnIndex = mDetail.indexOf("return");
    int l = mDetail.indexOf("\"", returnIndex);
    int r = mDetail.indexOf("\"", (l + 1));
    java.lang.String javaname = mDetail.substring((l + 1), r);
    mClass.setJavaClassName(javaname);
}