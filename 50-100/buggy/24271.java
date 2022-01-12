private void renderArgumentList(int i) {
    lineEnd("(");
    for (com.palantir.atlasdb.table.description.NameComponentDescription comp : desc.getRowParts().subList(0, i)) {
        lineEnd(com.palantir.atlasdb.table.description.render.ComponentRenderers.varName(comp), ", ");
    }
    replace(", ", ")");
}