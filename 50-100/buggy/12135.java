@java.lang.Override
public void visitFile(final uk.co.itmoore.intellisubsteps.psi.PsiFile file) {
    uk.co.itmoore.intellisubsteps.psi.SubstepsCompletionContributor.logger.debug(((("got src file: " + (file.getName())) + " filetype: ") + (file.getFileType())));
    if (file instanceof uk.co.itmoore.intellisubsteps.psi.PsiJavaFile) {
        buildSuggestionsFromJavaSource(((uk.co.itmoore.intellisubsteps.psi.PsiJavaFile) (file)), stepImplsInScope);
    }else
        if (file instanceof uk.co.itmoore.intellisubsteps.psi.stepdefinition.psi.SubstepsDefinitionFile) {
            buildSuggestionsFromSubstepsSource(((uk.co.itmoore.intellisubsteps.psi.stepdefinition.psi.SubstepsDefinitionFile) (file)), resultSet);
        }
    
}