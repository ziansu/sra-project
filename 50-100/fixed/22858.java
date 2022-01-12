private void printHtmlOptionUsage(final java.io.PrintStream stream, final picard.cmdline.CommandLineParser.OptionDefinition optionDefinition) {
    final java.lang.String type = getUnderlyingType(optionDefinition.field).getSimpleName();
    final java.lang.String optionLabel = ((((prefixDot) + (optionDefinition.name)) + " (") + type) + ")";
    stream.println((((("<tr><td>" + optionLabel) + "</td><td>") + (makeOptionDescription(optionDefinition))) + "</td></tr>"));
}