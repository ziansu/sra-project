public soot.jimple.toolkits.typing.integer.TypeNode typeNode(soot.jimple.toolkits.typing.integer.Type type) {
    if ((type == null) || (!((type instanceof soot.jimple.toolkits.typing.integer.PrimType) || (type instanceof soot.jimple.toolkits.typing.integer.RefType)))) {
        throw new soot.jimple.toolkits.typing.integer.InternalTypingException();
    }
    soot.jimple.toolkits.typing.integer.TypeNode typeNode = typeNodeMap.get(type);
    if (typeNode == null) {
        throw new soot.jimple.toolkits.typing.integer.InternalTypingException();
    }
    return typeNode;
}