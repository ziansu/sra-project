@org.junit.Test
public void testGetLastPublishedVersionsPublicationStatus() {
    org.gbif.ipt.model.Resource r = getResource();
    org.junit.Assert.assertEquals(PublicationStatus.PRIVATE, r.getLastPublishedVersionsPublicationStatus());
}