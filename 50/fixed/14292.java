public java.lang.Boolean getzgdDump() {
    java.lang.String value = props.getProperty("dump");
    return value == null ? false : !(value.equalsIgnoreCase("0"));
}