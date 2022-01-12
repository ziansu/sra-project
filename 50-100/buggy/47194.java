private static void checkCannon(java.lang.String input, java.lang.String output) {
    com.himamis.retex.editor.share.model.MathFormula mf = null;
    try {
        mf = org.geogebra.io.latex.SerializeLaTeX.parser.parse(input);
        java.lang.System.out.println(mf.getRootComponent());
    } catch (org.geogebra.common.io.latex.ParseException e) {
        org.junit.Assert.assertNull(e);
    }
    org.junit.Assert.assertNotNull(mf);
    org.junit.Assert.assertEquals(((mf.getRootComponent()) + ""), output, org.geogebra.io.latex.SerializeLaTeX.serializer.serialize(mf));
}