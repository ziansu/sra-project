public static boolean cannotBeModified(final com.intellij.psi.codeStyle.CodeStyleScheme currentScheme) {
    return (currentScheme.isDefault()) || (com.intellij.application.options.codeStyle.CodeStyleSchemesModel.getSchemesManager().isShared(currentScheme));
}