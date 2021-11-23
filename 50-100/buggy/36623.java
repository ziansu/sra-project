public Abstract.ClassField resolveClassFieldByView(com.jetbrains.jetpad.vclang.term.Abstract.ClassView classView, java.lang.String name, com.jetbrains.jetpad.vclang.error.ErrorReporter errorReporter, com.jetbrains.jetpad.vclang.term.Abstract.SourceNode cause) {
    if (name.equals(classView.getClassifyingFieldName())) {
        return classView.getClassifyingField();
    }
    for (com.jetbrains.jetpad.vclang.term.Abstract.ClassViewField viewField : classView.getFields()) {
        if (name.equals(viewField.getName())) {
            return viewField.getUnderlyingField();
        }
    }
    errorReporter.report(new com.jetbrains.jetpad.vclang.naming.error.NotInScopeError(cause, name));
    return null;
}