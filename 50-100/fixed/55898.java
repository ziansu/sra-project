@org.junit.Test
public void collectionTest() throws java.io.IOException {
    rosa.iiif.presentation.model.Collection col = presentationTransformer.collection(loadValidCollection());
    org.junit.Assert.assertNotNull(col);
    org.junit.Assert.assertNotNull(col.getDescription("en"));
    org.junit.Assert.assertFalse(col.getDescription("en").isEmpty());
    java.lang.System.out.println(col);
}