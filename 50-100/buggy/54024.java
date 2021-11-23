public void writeSchema(tilda.parsing.ParserSession PS) {
    java.io.File file = new java.io.File(tilda.generation.html.DocGen.getSchemaChromeAppGenHTML(schema, ".html"));
    if (!(file.exists())) {
        new tilda.generation.graphviz.GraphvizUtil(this.schema, G).writeSchema();
    }else {
        try {
            writeHTML(PS);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}