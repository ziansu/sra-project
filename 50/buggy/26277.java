@java.lang.Override
protected void processElements(@org.jetbrains.annotations.NotNull
com.intellij.openapi.project.Project project, @org.jetbrains.annotations.NotNull
com.intellij.openapi.editor.Editor editor, java.util.Set<com.jetbrains.lang.dart.psi.DartComponent> elementsToProcess) {
    final com.intellij.codeInsight.template.TemplateManager templateManager = com.intellij.codeInsight.template.TemplateManager.getInstance(project);
    anchor = doAddMethodsForOne(editor, templateManager, buildFunctionsText(templateManager, elementsToProcess), anchor);
}