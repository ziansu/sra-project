@java.lang.Override
protected void setVariables(@org.jetbrains.annotations.NotNull
com.intellij.codeInsight.template.Template template, @org.jetbrains.annotations.NotNull
com.intellij.psi.PsiElement element) {
    com.intellij.codeInsight.template.impl.MacroCallNode node = new com.intellij.codeInsight.template.impl.MacroCallNode(new com.intellij.codeInsight.template.macro.VariableOfTypeMacro());
    node.addParameter(new com.intellij.codeInsight.template.impl.ConstantNode(com.kogitune.intellij.codeinsight.postfix.utils.AndroidClassName.CONTEXT.toString()));
    template.addVariable("context", node, new com.intellij.codeInsight.template.impl.ConstantNode(""), false);
}