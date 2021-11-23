public void htmlPrintOptions(final java.io.PrintStream stream, final boolean printCommon) {
    stream.println("<table>");
    stream.println("<tr><th>Option</th><th>Description</th></tr>");
    if (printCommon) {
        for (final java.lang.String[] optionDoc : picard.cmdline.CommandLineParser.FRAMEWORK_OPTION_DOC) {
            stream.println((((("<tr><td>" + (optionDoc[0])) + "</td><td>") + (picard.cmdline.CommandLineParser.htmlEscape(optionDoc[2]))) + "</td></tr>"));
        }
    }
    htmlPrintOptionTableRows(stream, printCommon);
    stream.println("</table>");
}