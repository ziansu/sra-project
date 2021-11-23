public java.lang.String decoratedMessage() {
    java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    return ((((((dateFormat.format(date)) + ":") + (this.name)) + " ") + ":") + (textLine)) + (java.lang.System.lineSeparator());
}