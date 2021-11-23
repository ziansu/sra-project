@java.lang.Override
public void run() {
    if ((biometric_client) != null) {
        biometric_client.cancel();
        biometric_client = null;
    }
    biometric_client = new com.neurotec.biometrics.client.NBiometricClient();
    setPrompt(com.globe3.tno.g3_mobile.fragments.LocationCheckFragment.PROMPT_CONNECTING);
}