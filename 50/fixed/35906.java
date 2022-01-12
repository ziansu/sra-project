@java.lang.Override
public com.puppycrawl.tools.checkstyle.api.DetailNode[] getChildren() {
    if ((children) == null) {
        return null;
    }else {
        return java.util.Arrays.copyOf(children, children.length);
    }
}