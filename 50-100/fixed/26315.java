protected java.lang.String formatInstance(final java.lang.String instantString) {
    if ((instantString.length()) == (com.speedment.common.logger.internal.formatter.PlainFormatter.INSTANCE_LENGTH)) {
        return instantString;
    }
    final int missingCharacters = (com.speedment.common.logger.internal.formatter.PlainFormatter.INSTANCE_LENGTH) - (instantString.length());
    if (missingCharacters > 4) {
        return instantString;
    }
    final java.lang.String padding = ".000".substring((4 - missingCharacters));
    return ((instantString.substring(0, ((instantString.length()) - 1))) + padding) + "Z";
}