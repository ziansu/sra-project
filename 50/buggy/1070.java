public static void formatRange(java.lang.String source, org.jetbrains.kotlin.formatting.KotlinFormatterUtils.NetBeansDocumentRange range, org.jetbrains.kotlin.psi.KtPsiFactory psiFactory, java.lang.String fileName) {
    org.jetbrains.kotlin.formatting.KotlinFormatterUtils.formatRange(source, range.toPsiRange(source), psiFactory, fileName);
}