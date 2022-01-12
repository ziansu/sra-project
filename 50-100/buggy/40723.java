public static com.sun.source.util.TreePath expensiveBackupGetPath(final javax.lang.model.element.Element element, final com.sun.source.tree.Tree tree, final checkers.inference.InferenceAnnotatedTypeFactory inferenceTypeFactory) {
    javax.lang.model.element.TypeElement typeElement = org.checkerframework.javacutil.ElementUtils.enclosingClass(element);
    com.sun.source.tree.CompilationUnitTree compilationUnitTree = inferenceTypeFactory.getTreeUtils().getPath(typeElement).getCompilationUnit();
    return inferenceTypeFactory.getTreeUtils().getPath(compilationUnitTree, tree).getParentPath();
}