@java.lang.Override
protected void processElements(@org.jetbrains.annotations.NotNull
final com.intellij.openapi.project.Project project, @org.jetbrains.annotations.NotNull
final com.intellij.openapi.editor.Editor editor, @org.jetbrains.annotations.NotNull
final java.util.Set<com.jetbrains.lang.dart.psi.DartComponent> elementsToProcess) {
    final com.intellij.codeInsight.template.TemplateManager templateManager = com.intellij.codeInsight.template.TemplateManager.getInstance(project);
    anchor = doAddMethodsForOne(editor, templateManager, buildFunctionsText(templateManager, elementsToProcess), anchor);
}