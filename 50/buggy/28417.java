public void setMutability(dyvilx.tools.compiler.ast.type.Mutability mutability) {
    this.mutability = mutability;
    this.theClass = dyvilx.tools.compiler.ast.type.compound.MapType.getClass(mutability);
}