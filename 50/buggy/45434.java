public static void reformatAll(org.jetbrains.kotlin.psi.KtFile containingFile, com.intellij.formatting.Block rootBlock, com.intellij.psi.codeStyle.CodeStyleSettings settings, java.lang.String source) {
    org.jetbrains.kotlin.formatting.KotlinFormatterUtils.formatRange(containingFile, rootBlock, settings, source, containingFile.getTextRange());
}