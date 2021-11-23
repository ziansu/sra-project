@java.lang.Override
public int getWidth() {
    if ("Column: Name".equals(this.toString())) {
        java.lang.System.out.println(("Get Width " + (super.getWidth())));
    }
    return super.getWidth();
}