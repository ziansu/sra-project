private void renderArgumentList(int i) {
    lineEnd("(");
    for (com.palantir.atlasdb.table.description.NameComponentDescription comp : desc.getRowParts().subList(0, i)) {
        lineEnd(varName(comp), ", ");
    }
    replace(", ", ")");
}