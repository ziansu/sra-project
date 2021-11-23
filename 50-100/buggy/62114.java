public java.lang.String formatCode() {
    new com.intellij.formatting.FormatterImpl();
    org.jetbrains.kotlin.formatting.KotlinBlock rootBlock = new org.jetbrains.kotlin.formatting.KotlinBlock(ktFile.getNode(), org.jetbrains.kotlin.formatting.NodeAlignmentStrategy.getNullStrategy(), com.intellij.formatting.Indent.getNoneIndent(), null, org.jetbrains.kotlin.formatting.KotlinFormatterUtils.getSettings(), org.jetbrains.kotlin.idea.formatter.KotlinSpacingRulesKt.createSpacingBuilder(org.jetbrains.kotlin.formatting.KotlinFormatterUtils.getSettings(), org.jetbrains.kotlin.formatting.KotlinFormatter.KotlinSpacingBuilderUtilImpl.INSTANCE));
    org.jetbrains.kotlin.formatting.KotlinFormatterUtils.reformatAll(ktFile, rootBlock, org.jetbrains.kotlin.formatting.KotlinFormatterUtils.getSettings(), source);
    return source;
}