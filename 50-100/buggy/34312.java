java.lang.String runFormatter(org.eclipse.jdt.core.formatter.CodeFormatter codeFormatter, java.lang.String source, int kind, int indentationLevel, org.eclipse.jface.text.IRegion[] regions, java.lang.String lineSeparator) {
    org.eclipse.text.edits.TextEdit edit = codeFormatter.format(kind, source, regions, indentationLevel, lineSeparator);
    return edit == null ? null : org.eclipse.jdt.internal.core.util.Util.editedString(source, edit);
}