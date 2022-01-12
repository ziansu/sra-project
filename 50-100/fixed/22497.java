private <E extends com.intellij.psi.PsiElement> void reportDiagnostic(E element, org.jetbrains.kotlin.cli.common.messages.DiagnosticFactory0<E> factory, java.lang.String message) {
    org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.MyDiagnostic<?> diagnostic = new org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.MyDiagnostic<E>(element, factory, message);
    org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.reportDiagnostic(diagnostic, messageCollector, false);
    if ((element.getTextRange().getStartOffset()) != (file.getTextRange().getEndOffset())) {
        allErrorsAtEof = false;
    }
    hasErrors = true;
}