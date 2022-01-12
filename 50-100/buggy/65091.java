@org.junit.Test
public void testConstructor() {
    com.xamoom.android.xamoomsdk.Resource.Style style = new com.xamoom.android.xamoomsdk.Resource.Style();
    style.setBackgroundColor("#000000");
    style.setForegroundFontColor("#FFFFFF");
    style.setHighlightFontColor("#FFF000");
    com.xamoom.android.xamoomcontentblocks.Adapters.ContentBlockAdapter adapter = new com.xamoom.android.xamoomcontentblocks.Adapters.ContentBlockAdapter(new android.support.v4.app.Fragment(), new java.util.ArrayList<com.xamoom.android.xamoomsdk.Resource.ContentBlock>(), style, new com.xamoom.android.xamoomsdk.EnduserApi("apikey"), false, "apikey", null);
    junit.framework.TestCase.assertNotNull(adapter);
}