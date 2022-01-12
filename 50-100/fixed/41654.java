@org.jetbrains.annotations.Nullable
public static <T extends com.intellij.psi.PsiElement> T getAPostfixArgument(com.kaylerrenslow.a3plugin.lang.sqf.psi.SQFCommandExpression commandExpression, java.lang.Class<T> tClass) {
    com.intellij.psi.PsiElement postfix = commandExpression.getPostfixArgument();
    while (postfix != null) {
        if (tClass.isInstance(postfix)) {
            return ((T) (postfix));
        }
        if (postfix instanceof com.kaylerrenslow.a3plugin.lang.sqf.psi.SQFCommandExpression) {
            postfix = ((com.kaylerrenslow.a3plugin.lang.sqf.psi.SQFCommandExpression) (postfix)).getPostfixArgument();
        }else {
            return null;
        }
    } 
    return null;
}