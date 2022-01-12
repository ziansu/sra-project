private java.lang.String calc(java.lang.String input) {
    java.lang.String returnString = "";
    java.lang.String front = input.substring(2, ((input.length()) - 1));
    java.lang.String back = input.substring(0, 1);
    returnString = front + back;
    return returnString;
}