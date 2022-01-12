@java.lang.Override
@org.mustbe.consulo.RequiredReadAction
public void visitTypeDeclaration(org.mustbe.consulo.csharp.lang.psi.CSharpTypeDeclaration declaration) {
    org.mustbe.consulo.dotnet.psi.DotNetModifierList modifierList = declaration.getModifierList();
    assert modifierList != null;
    com.intellij.psi.PsiElement modifierElement = modifierList.getModifierElement(CSharpModifier.PARTIAL);
    if (modifierElement != null) {
        org.mustbe.consulo.csharp.lang.psi.impl.partial.CSharpCompositeTypeDeclaration compositeType = org.mustbe.consulo.csharp.ide.highlight.check.impl.CS0264.findCompositeType(declaration);
        if (compositeType == null) {
            holder.registerProblem(modifierElement, "Unnecessary modifier", ProblemHighlightType.LIKE_UNUSED_SYMBOL, new com.intellij.codeInspection.IntentionWrapper(new org.mustbe.consulo.csharp.ide.codeInsight.actions.RemoveModifierFix(org.mustbe.consulo.csharp.lang.psi.CSharpModifier.PARTIAL, declaration), declaration.getContainingFile()));
        }
    }
}