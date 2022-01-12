private java.lang.String toBinaryString(int number) {
    java.lang.StringBuilder temp = new java.lang.StringBuilder(java.lang.Integer.toHexString(number));
    int length = temp.length();
    for (int i = 0; i < (4 - length); i++)
        temp.append("0").append(temp);
    
    return temp.toString();
}