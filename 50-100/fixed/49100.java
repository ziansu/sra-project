public static boolean isLocal(com.redhat.ceylon.compiler.typechecker.model.Declaration decl) {
    int count = 0;
    com.redhat.ceylon.compiler.typechecker.model.Scope scope = com.redhat.ceylon.compiler.java.util.Decl.container(decl);
    while (scope instanceof com.redhat.ceylon.compiler.typechecker.model.ControlBlock) {
        scope = scope.getContainer();
        count++;
    } 
    if (((scope instanceof com.redhat.ceylon.compiler.typechecker.model.Getter) || (scope instanceof com.redhat.ceylon.compiler.typechecker.model.Setter)) || (scope instanceof com.redhat.ceylon.compiler.typechecker.model.Method)) {
        return true;
    }else
        if ((scope instanceof java.lang.Class) && (count > 0)) {
            return true;
        }
    
    return false;
}