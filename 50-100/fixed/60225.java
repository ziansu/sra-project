public java.lang.String replaceReceiverAddress(java.lang.String in) {
    java.util.regex.Matcher matcher = pattern.matcher(in);
    if (matcher.find()) {
        knx.KNXAddressList address = new knx.KNXAddressList();
        return (("receiver: " + (address.addresses.get(matcher.group(0)))) + ", ") + in;
    }else {
        LogstashLogger.INSTANCE.message(("WARNING: matcher miss, no address (d/d/d) found in knx event " + in));
    }
    return in;
}