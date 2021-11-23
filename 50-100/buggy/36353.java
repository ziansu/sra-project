public soot.jimple.toolkits.typing.integer.TypeNode typeNode(soot.jimple.toolkits.typing.integer.Type type) {
    if (type == null) {
        return INT;
    }
    if (!((type instanceof soot.jimple.toolkits.typing.integer.PrimType) || (type instanceof soot.jimple.toolkits.typing.integer.RefType))) {
        return INT;
    }
    soot.jimple.toolkits.typing.integer.TypeNode typeNode = typeNodeMap.get(type);
    if (typeNode == null) {
        throw new soot.jimple.toolkits.typing.integer.InternalTypingException();
    }
    return typeNode;
}