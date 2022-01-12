private void fields() {
    for (com.palantir.atlasdb.table.description.NameComponentDescription comp : desc.getRowParts()) {
        line("private final ", typeName(comp), " ", varName(comp), ";");
    }
}