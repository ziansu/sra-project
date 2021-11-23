@org.junit.Before
public void setup() {
    android.app.Application app = org.robolectric.RuntimeEnvironment.application;
    com.epfl.dedis.cisc.AutomationTest.sucConnection = app.getResources().getString(R.string.suc_connection);
    com.epfl.dedis.cisc.AutomationTest.errNotFound = app.getResources().getString(R.string.err_not_found);
    gson = new com.google.gson.GsonBuilder().serializeNulls().create();
}