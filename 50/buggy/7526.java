@java.lang.Override
public int getEndLine() {
    if ((parser) != null) {
        return org.jetbrains.kotlin.diagnostics.DiagnosticUtils.offsetToLineAndColumn(parser.getDocument(), innerNode.getTextRange().getEndOffset()).getLine();
    }
    return 1000;
}