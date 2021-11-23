@java.lang.Override
public void getValue() {
    java.awt.Point p = java.awt.MouseInfo.getPointerInfo().getLocation();
    temp = p.x;
    java.lang.System.out.println(((("Getting Value from " + (getSourceID())) + ": ") + (temp)));
}