public java.lang.String getDate() {
    java.lang.StringBuilder strBuilder = new java.lang.StringBuilder();
    strBuilder.append(year);
    strBuilder.append('-');
    strBuilder.append(month);
    strBuilder.append('-');
    strBuilder.append(day);
    return strBuilder.toString();
}