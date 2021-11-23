@java.lang.Override
public void init() {
    kw.setNavContainer(new org.spo.fw.meta.fixture.runner.StubNavContainer());
    kw.setFactory(new org.spo.fw.meta.fixture.StubPageFactoryImpl());
    kw.setNavModel(new org.spo.fw.meta.fixture.page.StubNavModel());
}