@org.junit.Test(expected = ddf.catalog.transform.CatalogTransformerException.class)
public void testTransformNullInput() throws ddf.catalog.transform.CatalogTransformerException, java.io.IOException {
    ddf.catalog.transformer.input.pptx.PptxInputTransformer t = new ddf.catalog.transformer.input.pptx.PptxInputTransformer(inputTransformer, true);
    t.transform(null);
}