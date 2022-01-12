@java.lang.Override
public java.lang.String getData() {
    java.lang.String data = (internalName) + ",";
    for (java.awt.Point p : selectedPoints) {
        data += ((("(" + ((p.getX()) / (image.getWidth()))) + ":") + ((p.getY()) / (image.getHeight()))) + ");";
    }
    return data;
}