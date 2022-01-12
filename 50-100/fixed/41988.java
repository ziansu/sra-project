@org.junit.Test
public void testOle2() throws ddf.catalog.transform.CatalogTransformerException, java.io.IOException {
    ddf.catalog.transformer.input.pptx.PptxInputTransformer t = new ddf.catalog.transformer.input.pptx.PptxInputTransformer(inputTransformer);
    try (java.io.InputStream is = getResource("/empty.ppt")) {
        ddf.catalog.data.Metacard mc = t.transform(is);
        org.junit.Assert.assertThat(mc.getThumbnail(), org.hamcrest.core.Is.is(org.hamcrest.Matchers.nullValue()));
    }
}