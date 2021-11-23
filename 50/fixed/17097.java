public static java.lang.String escapeInputString(final java.lang.String s) {
    return s.replace(("" + (craftoplugin.utility.Json.BACKSLASH)), craftoplugin.utility.Json.MASKED_BACKSLASH).replace(("" + (craftoplugin.utility.Json.QUOTE)), craftoplugin.utility.Json.MASKED_QUOTE);
}