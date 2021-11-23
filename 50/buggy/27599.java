@org.junit.Before
public void BeforeRunTest() throws java.lang.Exception {
    ctx = android.support.test.InstrumentationRegistry.getTargetContext();
    android.util.Log.e(com.example.boba.lookapplication.TestWriteFile.TAG, ("----------------------Own context2: " + (java.lang.String.valueOf(ctx))));
}