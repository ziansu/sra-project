@org.junit.Test
public void testIsLastPublishedVersionPublic() {
    org.gbif.ipt.model.Resource r = getResource();
    org.junit.Assert.assertFalse(r.isLastPublishedVersionPublic());
}