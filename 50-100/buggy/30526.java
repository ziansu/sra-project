@org.junit.Test
public void encryptionFailIfFingerprintNotPresent() {
    com.jesusm.jfingerprintmanager.JFingerprintManager jFingerprintManager = createFingerPrintManager();
    org.mockito.Mockito.when(mockFingerprintHardware.isFingerprintAuthAvailable()).thenReturn(false);
    com.jesusm.jfingerprintmanager.encryption.presenter.EncryptionManagerTest.EncryptionCallbackAdapter callbackAdapter = org.mockito.Mockito.mock(com.jesusm.jfingerprintmanager.encryption.presenter.EncryptionManagerTest.EncryptionCallbackAdapter.class);
    java.lang.String message = "message";
    jFingerprintManager.encrypt(message, callbackAdapter, mockFragmentManager);
    org.mockito.Mockito.verify(callbackAdapter).onFingerprintNotAvailable();
    org.mockito.Mockito.verify(callbackAdapter, org.mockito.Mockito.never()).onEncryptionSuccess(org.mockito.Matchers.anyString());
}