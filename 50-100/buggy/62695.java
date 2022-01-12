private java.lang.String getParent(java.lang.String temp) {
    say(("Received: " + temp));
    if ((temp.length()) < 1)
        return "";
    
    int index = temp.substring(0, ((temp.length()) - 1)).lastIndexOf("\\");
    if (index > 0)
        return "";
    
    return temp.substring(0, index);
}