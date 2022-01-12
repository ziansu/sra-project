@org.junit.Test
public void testGetStandby() {
    org.mockito.Mockito.doReturn(uriList).when(dbClientMock).queryByType(com.emc.storageos.db.client.model.Site.class, true);
    standbySites.add(standbySite1);
    standbySites.add(standbySite2);
    org.mockito.Mockito.doReturn(standbySites.iterator()).when(dbClientMock).queryIterativeObjects(com.emc.storageos.db.client.model.Site.class, uriList);
    com.emc.storageos.model.dr.SiteRestRep response = drService.getStandby("site-uuid-1");
}