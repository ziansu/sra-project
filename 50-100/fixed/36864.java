@java.lang.Override
public boolean preVisit(com.google.protobuf.Message message) {
    if ((decl) != null)
        return false;
    
    if (message instanceof boa.types.Ast.Declaration) {
        boa.types.Ast.Declaration type = ((boa.types.Ast.Declaration) (message));
        if ((type.getKey()) == nodeId) {
            decl = type;
            return false;
        }
    }
    return true;
}