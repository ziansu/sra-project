public static java.lang.String truncate(final java.lang.String input, final int maxWidth) {
    if (input == null)
        return null;
    
    net.dv8tion.jda.core.utils.Checks.notNegative(maxWidth, "maxWidth");
    if ((input.length()) == maxWidth)
        return input;
    
    if (maxWidth == 0)
        return "";
    
    return input.substring(0, maxWidth);
}