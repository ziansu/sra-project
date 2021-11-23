private static java.lang.String getMessage(org.eclipse.php.ui.text.correction.IProblemLocation location) {
    java.lang.String message = "";
    org.eclipse.php.internal.core.compiler.ast.parser.PhpProblemIdentifier id = org.eclipse.php.internal.core.compiler.ast.parser.PhpProblemIdentifier.getProblem(location.getProblemIdentifier());
    switch (id) {
        case UnusedImport :
        case ImportNotFound :
            message = org.eclipse.php.internal.ui.text.correction.CorrectionMessages.RemoveUnusedUseStatementProposal_removeunusedusestatement_description;
            break;
        case DuplicateImport :
            message = org.eclipse.php.internal.ui.text.correction.CorrectionMessages.RemoveUnusedUseStatementProposal_removeduplicateusestatement_description;
            break;
        case UnnecessaryImport :
            message = org.eclipse.php.internal.ui.text.correction.CorrectionMessages.RemoveUnusedUseStatementProposal_removeunnecessaryusestatement_description;
            break;
        default :
            break;
    }
    return message;
}