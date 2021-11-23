public boolean isInsideMethod() {
    boolean isInsideMethod = false;
    java.lang.String[] p1 = this.body.split("<<<<<<<");
    java.lang.String[] p2 = this.body.split(">>>>>>>");
    java.lang.String[] p3 = p2[((p2.length) - 1)].split("\n");
    if ((!(p1[0].equals(""))) && ((p3.length) > 1)) {
        isInsideMethod = true;
    }
    return isInsideMethod;
}