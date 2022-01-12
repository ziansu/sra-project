public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(((this.get(java.util.Calendar.MONTH)) + 1));
    sb.append("/");
    sb.append(this.get(java.util.Calendar.DATE));
    sb.append("/");
    sb.append(this.get(java.util.Calendar.YEAR));
    return sb.toString();
}