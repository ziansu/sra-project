@org.junit.Test
public void testGetItemCount() {
    com.xamoom.android.xamoomcontentblocks.Adapters.ContentBlockAdapter adapter = new com.xamoom.android.xamoomcontentblocks.Adapters.ContentBlockAdapter(null, contentBlockList, null, false, null, null);
    junit.framework.TestCase.assertEquals(adapter.getItemCount(), 11);
}