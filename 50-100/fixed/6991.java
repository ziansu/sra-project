public java.lang.String getTime() {
    java.lang.String ret = "";
    if ((hour) < 10)
        ret += "0";
    
    ret += (java.lang.String.valueOf(hour)) + " : ";
    if ((minute) < 10)
        ret += "0";
    
    ret += java.lang.String.valueOf(minute);
    return ret;
}