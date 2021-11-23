@org.junit.Test
public void useAppContext() throws java.lang.Exception {
    android.content.Context appContext = android.support.test.InstrumentationRegistry.getTargetContext();
    assertEquals("slak.fslistview.test", appContext.getPackageName());
}