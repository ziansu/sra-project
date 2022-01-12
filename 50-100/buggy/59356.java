public java.lang.String toString() {
    java.lang.String s = "";
    s += _zip;
    s += (_checkDigit) + " ";
    s += "|";
    for (int i = 0; i < (_zip.length()); i++) {
        java.lang.System.out.println("sfsF");
        s += BarCode.code[java.lang.Integer.parseInt(_zip.substring(i))];
    }
    s += "|";
    return s;
}