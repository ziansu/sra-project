private java.lang.String cutStringUntilTheFirstSpaceIfItExists(java.lang.String s) {
    if (s.contains(" "))
        return s.substring(0, s.indexOf(" "));
    else
        return s;
    
}