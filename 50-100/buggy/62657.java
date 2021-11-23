@java.lang.Override
protected boolean isInContext(@org.jetbrains.annotations.NotNull
com.intellij.psi.PsiElement element) {
    com.intellij.psi.PsiElement e = element;
    while ((e != null) && (!(e instanceof org.jetbrains.kotlin.idea.liveTemplates.JetClassOrObject))) {
        if (e instanceof org.jetbrains.kotlin.idea.liveTemplates.JetModifierList) {
            e = e.getParent();
            if (e != null) {
                e = e.getParent();
            }
            continue;
        }
        if ((e instanceof org.jetbrains.kotlin.idea.liveTemplates.JetProperty) || (e instanceof org.jetbrains.kotlin.idea.liveTemplates.JetNamedFunction)) {
            return false;
        }
        e = e.getParent();
    } 
    return true;
}