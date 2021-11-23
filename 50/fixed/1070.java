public static java.lang.String formatRange(java.lang.String source, org.jetbrains.kotlin.formatting.KotlinFormatterUtils.NetBeansDocumentRange range, org.jetbrains.kotlin.psi.KtPsiFactory psiFactory, java.lang.String fileName) {
    return org.jetbrains.kotlin.formatting.KotlinFormatterUtils.formatRange(source, range.toPsiRange(source), psiFactory, fileName);
}