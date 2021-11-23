@java.lang.Override
protected void setVariables(@org.jetbrains.annotations.NotNull
com.intellij.codeInsight.template.Template template, @org.jetbrains.annotations.NotNull
com.intellij.psi.PsiElement element) {
    com.intellij.codeInsight.template.impl.MacroCallNode node = new com.intellij.codeInsight.template.impl.MacroCallNode(new com.kogitune.intellij.codeinsight.postfix.macro.TagMacro());
    template.addVariable("TAG", node, new com.intellij.codeInsight.template.impl.ConstantNode(""), false);
}