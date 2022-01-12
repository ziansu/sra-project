public static boolean dumpProblemsToStdErr(org.eclipse.jdt.core.dom.CompilationUnit ast) {
    boolean hasErrors = false;
    for (org.eclipse.jdt.core.compiler.IProblem problem : ast.getProblems()) {
        if (problem.isError()) {
            sharpen.core.framework.ASTUtility.dumpProblem(problem);
            hasErrors = true;
        }
    }
    return hasErrors;
}