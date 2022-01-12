@org.junit.Test
public void test_addAlbumToList() throws java.lang.Exception {
    at.sw2017.awesomeinc.awesomeplayer.Album album = new at.sw2017.awesomeinc.awesomeplayer.Album();
    android.test.MoreAsserts.assertNotEqual(null, album);
    at.sw2017.awesomeinc.awesomeplayer.AlbumListAdapter adapter = new at.sw2017.awesomeinc.awesomeplayer.AlbumListAdapter(album);
    android.test.MoreAsserts.assertNotEqual(null, adapter);
    adapter.addAlbum("Hallo Welt!");
    junit.framework.Assert.assertTrue(((adapter.getItemCount()) == 1));
}