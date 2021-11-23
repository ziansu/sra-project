private boolean inherits(com.redhat.ceylon.model.typechecker.model.Declaration td) {
    if (((declaration) instanceof com.redhat.ceylon.model.typechecker.model.TypeDeclaration) && (td instanceof com.redhat.ceylon.model.typechecker.model.TypeDeclaration)) {
        return ((com.redhat.ceylon.model.typechecker.model.TypeDeclaration) (td)).inherits(((com.redhat.ceylon.model.typechecker.model.TypeDeclaration) (declaration)));
    }else
        if (((declaration) instanceof com.redhat.ceylon.model.typechecker.model.TypedDeclaration) && (td instanceof com.redhat.ceylon.model.typechecker.model.TypedDeclaration)) {
            return declaration.getRefinedDeclaration().equals(td.getRefinedDeclaration());
        }else {
            return false;
        }
    
}