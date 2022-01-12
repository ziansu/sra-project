@java.lang.Override
public java.lang.String toString() {
    java.lang.String s = "";
    s += (time.toSeconds()) + " ";
    s += (type) + " ";
    for (int i = 0; i < (circleTranslates.size()); i++) {
        s += (circleTranslates.get(i).toString()) + " ";
    }
    return s;
}