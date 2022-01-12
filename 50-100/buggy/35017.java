public boolean visit(org.eclipse.jdt.core.dom.VariableDeclarationStatement fs) {
    java.lang.String type = fs.getType().toString();
    for (java.lang.Object o : fs.fragments()) {
        org.eclipse.jdt.core.dom.VariableDeclarationFragment fd = ((org.eclipse.jdt.core.dom.VariableDeclarationFragment) (o));
        java.lang.System.out.println(fd.getName());
        cp.addVariable(fd.getName().toString(), type);
    }
    return false;
}