public static org.eclipse.php.internal.core.compiler.ast.parser.PhpProblemIdentifier getProblem(org.eclipse.dltk.compiler.problem.IProblemIdentifier identifier) {
    if (identifier instanceof org.eclipse.php.internal.core.compiler.ast.parser.PhpProblemIdentifier)
        return ((org.eclipse.php.internal.core.compiler.ast.parser.PhpProblemIdentifier) (identifier));
    
    return null;
}