@org.jetbrains.annotations.Nullable
public static com.intellij.formatting.Spacing getSpacing(@org.jetbrains.annotations.NotNull
final com.intellij.lang.ASTNode leftChild, @org.jetbrains.annotations.NotNull
final com.intellij.lang.ASTNode rightChild, final com.intellij.psi.codeStyle.CodeStyleSettings settings) {
    if (SpacingTokens.SPACING_AFTER.contains(leftChild.getElementType())) {
        return org.jetbrains.plugins.ruby.ruby.lang.formatter.processors.RubySpacingProcessor.SINGLE_SPACING;
    }
    if (SpacingTokens.NO_SPACING_BEFORE.contains(rightChild.getElementType())) {
        return org.jetbrains.plugins.ruby.ruby.lang.formatter.processors.RubySpacingProcessor.NO_SPACING;
    }
    if ((rightChild.getPsi()) instanceof org.jetbrains.plugins.ruby.ruby.lang.psi.controlStructures.RCondition) {
        return org.jetbrains.plugins.ruby.ruby.lang.formatter.processors.RubySpacingProcessor.NO_EOL_SPACING;
    }
    return null;
}