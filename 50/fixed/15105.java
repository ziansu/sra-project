@org.junit.After
public void tearDown() throws java.lang.Exception {
    bbct.android.common.test.DatabaseUtil dbUtil = new bbct.android.common.test.DatabaseUtil(this.inst.getTargetContext());
    dbUtil.clearDatabase();
}