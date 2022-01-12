@org.junit.Test
public void pluginHasInfoProperties() throws java.io.IOException {
    lv.ctco.scm.mobile.MobilePluginUtil.getPluginInfo(this.getClass().getClassLoader().getResourceAsStream("plugin-info.properties"));
    assertNotNull(lv.ctco.scm.mobile.MobilePluginUtil.getPluginGroup());
    assertNotNull(lv.ctco.scm.mobile.MobilePluginUtil.getPluginName());
    assertNotNull(lv.ctco.scm.mobile.MobilePluginUtil.getPluginVersion());
    assertEquals("lv.ctco.scm", lv.ctco.scm.mobile.MobilePluginUtil.getPluginGroup());
    assertEquals("gradle-mobile-plugin", lv.ctco.scm.mobile.MobilePluginUtil.getPluginName());
}