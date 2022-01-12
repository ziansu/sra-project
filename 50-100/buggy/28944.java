public void testArbol() throws java.lang.Exception {
    util.Grafo g = util.GrafosFactory.randomTree(10, 4);
    mbt.modelo.arboles.modificado.Modelo m = new mbt.modelo.arboles.modificado.Modelo(g, 0, 1);
    m.solve(new java.io.ByteArrayOutputStream());
    org.junit.Assert.assertEquals(m.getSolucion()[0], mbt.modelo.arboles.modificado.TestModelo.calcularT(g));
}