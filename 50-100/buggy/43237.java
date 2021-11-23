private void constructor() {
    line("private ", Name);
    renderParameterList();
    lineEnd(" {");
    {
        for (com.palantir.atlasdb.table.description.NameComponentDescription comp : desc.getRowParts()) {
            line("this.", com.palantir.atlasdb.table.description.render.ComponentRenderers.varName(comp), " = ", com.palantir.atlasdb.table.description.render.ComponentRenderers.varName(comp), ";");
        }
    }
    line("}");
}