void newTest() {
    android.util.Log.d(fi.aalto.ssg.opentee.testapp.MainActivity.TAG, "******* Starting test ********");
    fi.aalto.ssg.opentee.ITEEClient client = new fi.aalto.ssg.opentee.imps.OTClient();
    try {
        if (client != null)
            client.initializeContext(fi.aalto.ssg.opentee.testapp.MainActivity.TEE_NAME, getApplication());
        
    } catch (fi.aalto.ssg.opentee.ClientException e) {
        e.printStackTrace();
    } catch (android.os.RemoteException e) {
        e.printStackTrace();
    }
    android.util.Log.d(fi.aalto.ssg.opentee.testapp.MainActivity.TAG, "******* End of test ********");
}