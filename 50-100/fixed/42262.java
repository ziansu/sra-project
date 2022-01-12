public java.lang.String getReceiversString() {
    java.lang.StringBuilder buf = new java.lang.StringBuilder();
    for (java.lang.String a : receivers) {
        buf.append(a).append(',');
    }
    java.lang.String receiver = buf.toString();
    if (!(receiver.isEmpty()))
        receiver = receiver.substring(0, ((receiver.length()) - 1));
    
    return receiver;
}