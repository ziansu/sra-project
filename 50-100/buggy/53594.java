public boolean visit(org.eclipse.jdt.core.dom.MethodDeclaration md) {
    int startLine = cu.getLineNumber(md.getStartPosition());
    int endLine = cu.getLineNumber(((md.getStartPosition()) + (md.getLength())));
    if ((startLine <= lineNumber) && (endLine >= lineNumber)) {
        microbat.codeanalysis.ast.LocalVariableScope lvs = new microbat.codeanalysis.ast.LocalVariableScope(variableName, md);
        variableScopeList.add(lvs);
    }
    return false;
}