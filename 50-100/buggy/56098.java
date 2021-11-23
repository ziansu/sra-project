private com.jetbrains.jetpad.vclang.term.pattern.elimtree.LeafElimTreeNode readLeaf(com.jetbrains.jetpad.vclang.module.caching.serialization.ExpressionProtos.ElimTreeNode.Leaf proto) throws com.jetbrains.jetpad.vclang.module.caching.serialization.DeserializationError {
    java.util.List<com.jetbrains.jetpad.vclang.module.caching.serialization.Binding> context = new java.util.ArrayList<>();
    for (int ref : proto.getMatchedRefList()) {
        context.add(((com.jetbrains.jetpad.vclang.module.caching.serialization.TypedBinding) (readBindingRef(ref, false))));
    }
    com.jetbrains.jetpad.vclang.term.pattern.elimtree.LeafElimTreeNode result = new com.jetbrains.jetpad.vclang.term.pattern.elimtree.LeafElimTreeNode((proto.getArrowLeft() ? Abstract.Definition.Arrow.LEFT : Abstract.Definition.Arrow.RIGHT), readExpr(proto.getExpr()));
    result.setMatched(context);
    return result;
}