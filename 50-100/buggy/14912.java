private boolean needsJavaTypeAnnotations(com.redhat.ceylon.model.typechecker.model.Declaration decl) {
    com.redhat.ceylon.model.typechecker.model.Declaration reqdecl = decl;
    if ((reqdecl instanceof com.redhat.ceylon.model.typechecker.model.FunctionOrValue) && (((com.redhat.ceylon.model.typechecker.model.FunctionOrValue) (reqdecl)).isParameter())) {
        reqdecl = com.redhat.ceylon.compiler.java.codegen.CodegenUtil.getParameterized(((com.redhat.ceylon.model.typechecker.model.FunctionOrValue) (reqdecl)));
    }
    if (reqdecl instanceof com.redhat.ceylon.model.typechecker.model.TypeDeclaration) {
        return true;
    }else {
        return !(com.redhat.ceylon.compiler.java.codegen.Decl.isLocal(reqdecl));
    }
}