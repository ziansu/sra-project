public void renderToFile(com.ggasoftware.indigo.IndigoObject obj, java.lang.String filename) {
    _indigo.setSessionID();
    com.ggasoftware.indigo.Indigo.checkResult(this, com.ggasoftware.indigo.IndigoRenderer._lib.indigoRenderToFile(obj.self, filename));
}