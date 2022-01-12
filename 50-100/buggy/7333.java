@java.lang.Override
public boolean decode(@org.jetbrains.annotations.NotNull
final com.intellij.openapi.util.TextRange rangeInsideHost, @org.jetbrains.annotations.NotNull
final java.lang.StringBuilder outChars) {
    com.intellij.openapi.util.TextRange.assertProperRange(rangeInsideHost);
    java.lang.String subText = rangeInsideHost.substring(myHost.getText());
    if ((myHost.getRawString()) != null) {
        outChars.append(subText);
    }else {
        com.intellij.openapi.util.Ref<int[]> sourceOffsetsRef = new com.intellij.openapi.util.Ref<int[]>();
        com.goide.util.GoStringLiteralEscaper.parseStringCharacters(subText, outChars, sourceOffsetsRef);
        outSourceOffsets = sourceOffsetsRef.get();
    }
    return true;
}