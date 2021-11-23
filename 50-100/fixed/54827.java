public boolean isInsideMethod() {
    boolean isInsideMethod = false;
    java.lang.String[] p1 = this.body.split("<<<<<<<");
    if (!(p1[0].equals(""))) {
        isInsideMethod = true;
    }
    return isInsideMethod;
}