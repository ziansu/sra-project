public void testCalcularT() throws java.lang.Exception {
    util.Grafo g = util.GraphUtils.loadFromTxt("G11_ver");
    mbt.modelo.arboles.modificado.Modelo m = new mbt.modelo.arboles.modificado.Modelo(g, 0, 1, true);
    m.solve(new java.io.ByteArrayOutputStream());
    org.junit.Assert.assertEquals(m.getSolucion()[0], mbt.modelo.arboles.modificado.TestModelo.calcularT(g));
}