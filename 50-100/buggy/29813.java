@java.lang.Override
protected final void render(final org.optimizationBenchmarking.utils.text.textOutput.ITextOutput out, final char[][] data, final int size) {
    char next;
    out.append(org.optimizationBenchmarking.utils.document.impl.latex._LaTeXMathMax.MAX_BEGIN);
    next = '{';
    for (final char[] operand : data) {
        out.append(next);
        next = ',';
        out.append(operand);
    }
    out.append(org.optimizationBenchmarking.utils.document.impl.latex._LaTeXMathMax.MAX_END);
}