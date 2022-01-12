@org.junit.Test
public void useAppContext() {
    org.junit.Assert.assertEquals("de.nenick.androidannotations.plugin.mvp.sample", appContext.getPackageName());
}