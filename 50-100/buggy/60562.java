@org.junit.Test
public void testGetItemViewType() {
    com.xamoom.android.xamoomcontentblocks.Adapters.ContentBlockAdapter adapter = new com.xamoom.android.xamoomcontentblocks.Adapters.ContentBlockAdapter(null, contentBlockList, null, null, false, null, null);
    junit.framework.TestCase.assertEquals(adapter.getItemViewType(0), 0);
    junit.framework.TestCase.assertEquals(adapter.getItemViewType(1), 1);
}