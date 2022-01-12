@org.junit.After
public void tearDown() throws java.lang.Exception {
    if ((org.openflexo.foundation.OpenflexoTestCase.serviceManager) != null) {
        org.openflexo.foundation.OpenflexoTestCase.serviceManager.stopAllServices();
    }
    org.openflexo.kvc.KeyValueLibrary.clearCache();
}