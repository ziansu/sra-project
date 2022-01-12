public org.eclipse.objectteams.otdt.internal.core.compiler.model.TeamModel getSuperTeam() {
    org.eclipse.jdt.internal.compiler.lookup.TypeBinding superBinding = null;
    if ((this._ast) != null) {
        if ((this._ast.superclass) != null)
            superBinding = this._ast.superclass.resolveType(this._ast.scope);
        
    }else {
        superBinding = this._binding.superclass();
    }
    if (superBinding == null)
        return null;
    
    assert superBinding.isClass();
    return ((org.eclipse.jdt.internal.compiler.lookup.ReferenceBinding) (superBinding)).getTeamModel();
}