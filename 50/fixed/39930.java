@org.junit.Test
public void testIsLastPublishedVersionPublic() {
    org.gbif.ipt.model.Resource r = getResource();
    assertFalse(r.isLastPublishedVersionPublic());
}