private final void __finalizeFigureSeries(final org.optimizationBenchmarking.utils.text.textOutput.ITextOutput out) {
    final java.nio.file.Path[] paths;
    if (this.m_hasFigureSeries) {
        paths = this._requireResources(org.optimizationBenchmarking.utils.document.impl.latex._LaTeXDocument.class, new java.lang.String[]{ org.optimizationBenchmarking.utils.document.impl.latex._LaTeXDocument.FIGURE_SERIES_PACKAGE }, "The figureSeries Package is under LaTeX Project Public License, either version 1.3 of this license or (at your option) any later version. It is author-maintained by Thomas Weise. Copyright (c) 2014, 2015 Thomas Weise.");
        if ((paths[0]) != null) {
            org.optimizationBenchmarking.utils.document.impl.latex._LaTeXDocument.__requirePackage(out, this._pathRelativeToDocument(paths[0], true));
            org.optimizationBenchmarking.utils.document.impl.latex.LaTeXDriver._endLine(out);
        }
    }
}