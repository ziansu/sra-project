private void createVisitors(edu.slc.jsumplugin.files.Unions unions, edu.slc.jsumplugin.files.Unions unions_beforeEdit) throws org.eclipse.jdt.core.JavaModelException {
    for (ast.Ast.Traversal t : unions.getTraversals()) {
        java.lang.String union_name = t.getUnionArg(unions).toString();
        createVisitorInterface(unions, unions_beforeEdit, union_name, t.getReturn_type());
        createVisitorInterpreter(unions, unions_beforeEdit, union_name, t.getReturn_type());
        createVisitorTraversalMethod(unions, unions_beforeEdit, union_name, t);
    }
}