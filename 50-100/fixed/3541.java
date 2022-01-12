@org.junit.Test
public void getMediaByManagerList_emptyList() {
    int managerId = testManager.getId();
    boolean deleted = mediaDao.deleteMediaById(testMedia.getMediaId());
    assertTrue(deleted);
    java.util.List<com.workfront.intern.cb.common.Media> mediaList = mediaDao.getMediaListByManager(managerId);
    assertNotNull(mediaList);
    assertEquals(0, mediaList.size());
}