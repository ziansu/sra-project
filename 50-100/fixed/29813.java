@java.lang.Override
protected final void render(final org.optimizationBenchmarking.utils.text.textOutput.ITextOutput out, final char[][] data, final int size) {
    int index;
    char next;
    out.append(org.optimizationBenchmarking.utils.document.impl.latex._LaTeXMathMax.MAX_BEGIN);
    next = '{';
    for (index = 0; index < size; index++) {
        out.append(next);
        next = ',';
        out.append(data[index]);
    }
    out.append(org.optimizationBenchmarking.utils.document.impl.latex._LaTeXMathMax.MAX_END);
}