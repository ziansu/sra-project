@java.lang.Override
public void typeProcess(javax.lang.model.element.TypeElement element, com.sun.source.util.TreePath tree) {
    com.sun.tools.javac.util.Context context = ((com.sun.tools.javac.processing.JavacProcessingEnvironment) (processingEnv)).getContext();
    com.sun.tools.javac.util.Log log = com.sun.tools.javac.util.Log.instance(context);
    int nerrorsOfAllPreviousCheckers = this.errsOnLastExit;
    for (org.checkerframework.common.basetype.BaseTypeChecker checker : getSubcheckers()) {
        checker.errsOnLastExit += nerrorsOfAllPreviousCheckers;
        int errorsBeforeTypeChecking = log.nerrors;
        checker.typeProcess(element, tree);
        int errorsAfterTypeChecking = log.nerrors;
        nerrorsOfAllPreviousCheckers += errorsAfterTypeChecking - errorsBeforeTypeChecking;
    }
    this.errsOnLastExit += nerrorsOfAllPreviousCheckers;
    super.typeProcess(element, tree);
}