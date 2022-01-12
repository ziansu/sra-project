private java.lang.String calc(java.lang.String input) {
    java.lang.String returnString = "";
    java.lang.String front = input.substring(2, input.length());
    java.lang.String back = input.substring(0, 2);
    returnString = front + back;
    return returnString;
}