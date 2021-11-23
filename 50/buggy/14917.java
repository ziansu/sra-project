@org.junit.Test
public void useAppContext() {
    android.content.Context appContext = android.support.test.InstrumentationRegistry.getTargetContext();
    org.junit.Assert.assertEquals("de.nenick.androidannotations.plugin.mvp.sample", appContext.getPackageName());
}