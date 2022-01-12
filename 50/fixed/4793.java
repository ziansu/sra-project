@java.lang.Override
public void onNext(POGOProtos.Networking.Envelopes.RequestEnvelopeOuterClass.RequestEnvelope.AuthInfo authInfo) {
    showLoadingSpinner(false, true);
    storeUsernamePasswordInSharedPrefs(username, password);
    launchMapActivity(authInfo);
}