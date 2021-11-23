public java.lang.String toString() {
    java.lang.String s = "<Token type:" + (super.toString());
    if ((text) != null) {
        s = ((s + " text:\"") + (text)) + "\"";
    }
    s = s + ">";
    return s;
}