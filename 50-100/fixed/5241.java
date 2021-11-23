public void exportModelBinary(java.io.File path, modelcutter.Model model) {
    eu.printingin3d.javascad.vrl.export.StlBinaryFile writer = new eu.printingin3d.javascad.vrl.export.StlBinaryFile(path);
    try {
        writer.writeToFile(this.facetTransformerToSCAD(model));
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(modelcutter.ModelManagerImpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}