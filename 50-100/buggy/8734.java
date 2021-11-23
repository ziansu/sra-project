private java.lang.String toBinaryString(int number) {
    java.lang.String temp = java.lang.Integer.toHexString(number);
    int length = temp.length();
    for (int i = 0; i < (4 - length); i++)
        temp += "0" + temp;
    
    return temp;
}