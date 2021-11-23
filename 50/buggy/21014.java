@java.lang.Override
public void collectSlowLineMarkers(@org.jetbrains.annotations.NotNull
java.util.List<com.intellij.psi.PsiElement> list, @org.jetbrains.annotations.NotNull
java.util.Collection<com.intellij.codeInsight.daemon.LineMarkerInfo> collection) {
    for (com.intellij.psi.PsiElement psiElement : list) {
        collection.add(getLineMarkerInfo(psiElement));
    }
}