private void reverseString() {
    java.lang.StringBuilder tempString = new java.lang.StringBuilder();
    tempString.append(binaryNumber);
    tempString.reverse();
    binaryNumber = "";
    for (int i = 0; i < (tempString.length()); i++)
        binaryNumber += tempString.charAt(i);
    
}