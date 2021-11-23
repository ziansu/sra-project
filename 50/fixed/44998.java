@org.junit.Test(expected = java.lang.NullPointerException.class)
public void test_NULL_PIItemProduct() {
    lutuFactory.createLUTUConfiguration(null, cuProduct, cuUOM, bpartner, false);
}