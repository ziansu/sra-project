private java.lang.String getNumericValue() {
    java.lang.System.out.println(value);
    java.lang.String left = value.substring(0, ((value.length()) - (precision)));
    java.lang.String right = value.substring(((value.length()) - (precision)));
    return (left + ".") + right;
}