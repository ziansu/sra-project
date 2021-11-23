public boolean visit(org.eclipse.jdt.core.dom.TypeDeclaration td) {
    if (!(td.equals(this.typeDeclaration))) {
        clonepedia.codegeneration.diagram.bean.TypeWrapper innerType = new clonepedia.codegeneration.diagram.bean.TypeWrapper(td);
        innerType.setOwnerType(this);
        members.add(innerType);
    }
    return true;
}