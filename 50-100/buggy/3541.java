@org.junit.Test
public void getMediaByManagerList_emptyList() {
    boolean deleted = mediaDao.deleteMediaById(testMedia.getMediaId());
    assertTrue(deleted);
    int managerId = testManager.getId();
    java.util.List<com.workfront.intern.cb.common.Media> mediaList = mediaDao.getMediaListByManager(managerId);
    assertNotNull(mediaList);
    assertEquals(0, mediaList.size());
}