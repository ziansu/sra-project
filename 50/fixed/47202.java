public java.lang.String next() {
    java.lang.String returnString = next;
    next = null;
    bytesSent += (returnString.length()) + 1;
    return returnString;
}