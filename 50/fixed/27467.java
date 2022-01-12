@org.junit.Before
public void setUp() throws java.lang.Exception {
    android.util.Log.v(com.harlie.radiotheater.radiomysterytheater.data.TestRadioTheaterDb.TAG, "setUp");
    context = new android.test.RenamingDelegatingContext(android.support.test.InstrumentationRegistry.getContext(), "test_");
    helper = com.harlie.radiotheater.radiomysterytheater.data.RadioTheaterHelper.getInstance(context);
}