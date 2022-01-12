private void edit(org.eclipse.jdt.core.IImportDeclaration importDeclaration, org.eclipse.jdt.core.dom.rewrite.ImportRewrite implementationRewrite, org.eclipse.jdt.core.dom.rewrite.ImportRewrite interfaceRewrite) {
    java.lang.String name = importDeclaration.getElementName();
    if (implementationRewrite.removeImport(name)) {
        name = path.cutFirstSegment(name);
        implementationRewrite.addImport(name);
        interfaceRewrite.addImport(name);
    }else {
        logger.fatal(("Could not remove Ecore import " + name));
    }
}