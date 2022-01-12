@org.junit.Test
public void testOnDetachedFromRecyclerView() {
    android.support.v4.app.Fragment fragment = new android.support.v4.app.Fragment();
    com.xamoom.android.xamoomcontentblocks.Adapters.ContentBlockAdapter adapter = new com.xamoom.android.xamoomcontentblocks.Adapters.ContentBlockAdapter(fragment, contentBlockList, null, false, "apikey", null);
    adapter.onDetachedFromRecyclerView(new android.support.v7.widget.RecyclerView(org.robolectric.RuntimeEnvironment.application));
    junit.framework.Assert.assertNull(adapter.getFragment());
    junit.framework.Assert.assertNull(adapter.getEnduserApi());
    junit.framework.Assert.assertNull(adapter.getContentBlocks());
}