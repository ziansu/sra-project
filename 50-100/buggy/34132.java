private void setStringNotation(int hour, int minutes) {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    if ((hour / 9) == 0)
        stringBuilder.append("0");
    
    stringBuilder.append(hour).append(":");
    if ((minutes / 9) == 0)
        stringBuilder.append("0");
    
    stringBuilder.append(minutes);
    this.stringNotation = stringBuilder.toString();
}