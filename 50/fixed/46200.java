public java.lang.String getFriendlyStartString() {
    if ((!(isRange)) && (isFloating))
        return "";
    
    return start.format(TIME_FORMAT).toString();
}