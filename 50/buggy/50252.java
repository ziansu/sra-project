@org.junit.Test
public void testInsertArtist() throws java.lang.Exception {
    com.bobrusha.android.yandex.content_provider_server.model.Artist artist = com.bobrusha.android.yandex.content_provider_server.TestUtils.getArtist(1);
    dbBackend.insertArtistCV(com.bobrusha.android.yandex.content_provider_server.db.DbBackend.convertArtistToContentValues(artist));
    org.junit.Assert.assertEquals(1, getCount(db, Contract.ArtistEntry.TABLE_NAME));
}