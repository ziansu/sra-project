public byte[] renderGridToBuffer(com.ggasoftware.indigo.IndigoObject objects, int[] refAtoms, int ncolumns) {
    _indigo.setSessionID();
    if ((refAtoms != null) && ((objects.count()) != (refAtoms.length)))
        throw new com.ggasoftware.indigo.IndigoException(this, "refAtoms size does not match the number of objects");
    
    com.ggasoftware.indigo.IndigoObject buf = _indigo.writeBuffer();
    com.ggasoftware.indigo.Indigo.checkResult(this, com.ggasoftware.indigo.IndigoRenderer._lib.indigoRenderGrid(objects.self, refAtoms, ncolumns, buf.self));
    return buf.toBuffer();
}