@org.junit.Test
public void testJars() throws java.lang.Exception {
    final net.mountainblade.modular.impl.DefaultModuleManager manager = new net.mountainblade.modular.impl.DefaultModuleManager();
    final java.net.URL resource = getDemoJar();
    if (resource == null) {
        return ;
    }
    final java.util.Collection<net.mountainblade.modular.Module> modules = manager.loadModules(resource.toURI(), net.mountainblade.modular.PathHelper.near(net.mountainblade.modular.Module.class));
    org.junit.Assert.assertEquals(1, modules.size());
    manager.shutdown();
}