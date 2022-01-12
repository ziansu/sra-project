@org.junit.Test
public void executeGunTest() throws java.io.IOException {
    com.illmeyer.polygraph.core.Gun g = new com.illmeyer.polygraph.core.Gun();
    g.setAddressSupplier(getMockedAddressSupplier());
    g.setDispatcher(getMockedMessageDispatcher());
    g.setInitialTemplate("tpl/test/main");
    g.setLoader(getMockedTemplateLoader());
    g.initialize();
    g.trigger();
    g.destroy();
}