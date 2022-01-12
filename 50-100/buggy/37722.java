public org.eclipse.wst.jsdt.internal.compiler.ast.JavadocSingleNameReference findParam(char[] name) {
    if ((this.paramReferences) != null)
        for (int i = 0; i < (this.paramReferences.length); i++) {
            if (org.eclipse.wst.jsdt.core.compiler.CharOperation.equals(name, this.paramReferences[i].token))
                return this.paramReferences[i];
            
        }
    
    return null;
}