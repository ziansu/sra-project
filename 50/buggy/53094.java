@org.junit.BeforeClass
public static void prepare() throws java.lang.Exception {
    com.dotcms.util.IntegrationTestInitService.getInstance().init();
    org.mockito.Mockito.when(Config.CONTEXT.getRealPath("/WEB-INF/velocity")).thenReturn(com.dotmarketing.util.Config.getStringProperty("VELOCITY_ROOT", "/WEB-INF/velocity"));
}