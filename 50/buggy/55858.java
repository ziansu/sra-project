@org.jetbrains.annotations.NotNull
@java.lang.Override
public com.intellij.openapi.util.TextRange getRelevantTextRange() {
    return getTextRange().cutOut(com.intellij.openapi.util.TextRange.create(2, ((getTextLength()) - 2)));
}