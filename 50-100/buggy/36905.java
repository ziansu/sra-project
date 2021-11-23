public java.lang.String decoratedMessage() {
    java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    return (((((this.name) + " ") + (dateFormat.format(date))) + ":") + (textLine)) + (java.lang.System.lineSeparator());
}