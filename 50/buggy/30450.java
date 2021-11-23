java.lang.String toSimpleString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (me.wiefferink.areashop.messages.FancyMessageFormat.TextMessagePart part : content) {
        sb.append(part.toSimpleString());
    }
    return sb.toString();
}