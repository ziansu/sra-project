public void renderGridToFile(com.ggasoftware.indigo.IndigoObject objects, int[] refAtoms, int ncolumns, java.lang.String filename) {
    _indigo.setSessionID();
    if ((refAtoms != null) && ((objects.count()) != (refAtoms.length)))
        throw new com.ggasoftware.indigo.IndigoException(this, "refAtoms size does not match the number of objects");
    
    com.ggasoftware.indigo.Indigo.checkResult(this, objects, com.ggasoftware.indigo.IndigoRenderer._lib.indigoRenderGridToFile(objects.self, refAtoms, ncolumns, filename));
}