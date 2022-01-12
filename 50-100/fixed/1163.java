private void buildRollUpShapes() throws io.konig.spreadsheet.SpreadsheetException {
    io.konig.shacl.io.ShapeLoader loader = new io.konig.shacl.io.ShapeLoader(null, shapeManager);
    loader.load(graph);
    java.util.Set<java.lang.String> memory = new java.util.HashSet<>();
    java.util.List<io.konig.shacl.Shape> shapeList = shapeManager.listShapes();
    for (io.konig.shacl.Shape shape : shapeList) {
        org.openrdf.model.URI rollUpBy = shape.getRollUpBy();
        if (rollUpBy != null) {
            buildRollUpShape(shape, memory);
        }
    }
}