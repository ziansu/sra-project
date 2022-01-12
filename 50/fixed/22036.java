@org.testng.annotations.BeforeMethod
public void setUp() {
    loader = org.eclipse.golo.internal.testing.TestUtils.classLoader(this);
}