java.lang.StringBuilder toSimpleString(java.lang.StringBuilder sb) {
    for (me.wiefferink.areashop.messages.FancyMessageFormat.TextMessagePart part : content) {
        part.toSimpleString(sb);
    }
    return sb;
}