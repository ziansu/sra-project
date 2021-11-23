@org.junit.Test(expected = java.lang.RuntimeException.class)
public void onEmptyDatabaseName_shouldThrowRuntimeException() throws java.lang.RuntimeException {
    realmAssetHelper.loadDatabaseToStorage(null, null, null);
}