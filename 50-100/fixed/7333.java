@java.lang.Override
public boolean decode(@org.jetbrains.annotations.NotNull
final com.intellij.openapi.util.TextRange rangeInsideHost, @org.jetbrains.annotations.NotNull
final java.lang.StringBuilder outChars) {
    com.intellij.openapi.util.TextRange.assertProperRange(rangeInsideHost);
    java.lang.String subText = rangeInsideHost.substring(myHost.getText());
    if ((myHost.getRawString()) != null) {
        outChars.append(subText);
        return true;
    }
    return parseStringCharacters(subText, outChars);
}