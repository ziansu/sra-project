private void constructor() {
    line("private ", Name);
    renderParameterList();
    lineEnd(" {");
    {
        for (com.palantir.atlasdb.table.description.NameComponentDescription comp : desc.getRowParts()) {
            line("this.", varName(comp), " = ", varName(comp), ";");
        }
    }
    line("}");
}