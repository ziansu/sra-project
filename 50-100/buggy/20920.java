java.lang.String toSimpleString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    if ((color) != null) {
        sb.append(me.wiefferink.areashop.messages.FancyMessageFormat.SIMPLE_FORMAT_PREFIX_CHAR);
        sb.append(color.getNativeFormattingCode());
    }
    for (me.wiefferink.areashop.messages.FancyMessageFormat.FormatType format : formatTypes) {
        sb.append(me.wiefferink.areashop.messages.FancyMessageFormat.SIMPLE_FORMAT_PREFIX_CHAR);
        sb.append(format.getNativeFormattingCode());
    }
    sb.append(text);
    return sb.toString();
}