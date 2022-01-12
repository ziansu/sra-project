@org.junit.Test
public void getItemTest() throws java.lang.Exception {
    org.junit.Assert.assertEquals(menuListAdapter.getItem(0).getName(), firstMenu.getName());
    org.junit.Assert.assertEquals(menuListAdapter.getItem(2).getAuthor(), thirdMenu.getAuthor());
    org.junit.Assert.assertNotNull(menuListAdapter.getItemId(0));
}