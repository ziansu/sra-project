public static java.lang.String convertToConsole(final java.lang.Iterable<java.lang.String> inputLines) {
    if (inputLines == null) {
        return null;
    }
    java.util.LinkedList<me.wiefferink.areashop.messages.FancyMessageFormat.InteractiveMessagePart> parts = me.wiefferink.areashop.messages.FancyMessageFormat.parse(inputLines, false);
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    for (me.wiefferink.areashop.messages.FancyMessageFormat.InteractiveMessagePart part : parts) {
        result.append(part.toSimpleString());
    }
    return result.toString();
}