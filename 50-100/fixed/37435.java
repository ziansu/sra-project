public boolean isEqual(Exp left, Exp right) {
    temp = new java.lang.StringBuffer();
    printInfix(left);
    java.lang.String temp2 = temp.toString();
    temp = new java.lang.StringBuffer();
    printInfix(right);
    java.lang.String temp3 = temp.toString();
    return temp2.equals(temp3);
}