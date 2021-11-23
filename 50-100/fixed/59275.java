protected static void addToNodes(jkind.lustre.Node node) {
    for (jkind.lustre.Node inList : com.rockwellcollins.atc.agree.analysis.LustreAstBuilder.nodes) {
        if (node.id.equals(inList.id)) {
            throw new com.rockwellcollins.atc.agree.analysis.AgreeException((("AGREE Lustre AST Builder attempted to add multiple nodes of name '" + (node.id)) + "'"));
        }
    }
    com.rockwellcollins.atc.agree.analysis.LustreAstBuilder.nodes.add(node);
}