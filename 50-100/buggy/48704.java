@java.lang.Override
public boolean enterSuper(mirah.lang.ast.Super node, java.lang.Object arg) {
    org.mirah.typer.ResolvedType type = parsed.getResolvedType(node);
    if (type != null) {
        java.lang.String typeName = type.name();
        getCurrentDocument().addPair(ru.programpark.mirah.index.MirahIndexer.SUPER_CLASS, typeName, true, true);
    }
    return super.enterSuper(node, arg);
}