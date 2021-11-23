@org.junit.Test(expected = ddf.catalog.transform.CatalogTransformerException.class)
public void testBadCopy() throws ddf.catalog.transform.CatalogTransformerException, java.io.IOException {
    java.io.IOException ioe = new java.io.IOException();
    try {
        ddf.catalog.transformer.input.pptx.PptxInputTransformer t = new ddf.catalog.transformer.input.pptx.PptxInputTransformer(inputTransformer);
        java.io.InputStream is = org.mockito.Mockito.mock(java.io.InputStream.class);
        org.mockito.Mockito.when(is.read(org.mockito.Mockito.any())).thenThrow(ioe);
        t.transform(is);
    } catch (ddf.catalog.transform.CatalogTransformerException e) {
        org.junit.Assert.assertThat(e.getCause(), org.hamcrest.core.Is.is(ioe));
        throw e;
    }
}