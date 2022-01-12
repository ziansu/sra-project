@org.junit.Before
public final void setUp() {
    doSetUp(io.oasp.module.test.common.base.BaseTest.INITIALIZED);
    if (!(io.oasp.module.test.common.base.BaseTest.INITIALIZED)) {
        io.oasp.module.test.common.base.BaseTest.INITIALIZED = true;
    }
}