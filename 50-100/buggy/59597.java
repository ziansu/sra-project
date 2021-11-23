@org.jetbrains.annotations.NotNull
private org.jetbrains.kotlin.ui.editors.annotations.DiagnosticAnnotation createKotlinAnnotation(@org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.diagnostics.Diagnostic diagnostic, @org.jetbrains.annotations.NotNull
org.eclipse.core.resources.IFile file) {
    com.intellij.openapi.util.TextRange range = diagnostic.getTextRanges().get(0);
    return new org.jetbrains.kotlin.ui.editors.annotations.DiagnosticAnnotation(org.jetbrains.kotlin.eclipse.ui.utils.LineEndUtil.convertLfToDocumentOffset(diagnostic.getPsiFile().getText(), range.getStartOffset(), org.jetbrains.kotlin.eclipse.ui.utils.EditorUtil.getDocument(file)), range.getLength(), getAnnotationType(diagnostic.getSeverity()), org.jetbrains.kotlin.diagnostics.rendering.DefaultErrorMessages.render(diagnostic), diagnostic.getPsiElement().getText(), diagnostic.getFactory());
}