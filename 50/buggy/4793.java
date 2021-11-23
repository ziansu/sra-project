@java.lang.Override
public void onNext(POGOProtos.Networking.Envelopes.RequestEnvelopeOuterClass.RequestEnvelope.AuthInfo authInfo) {
    showLoadingSpinner(false);
    storeUsernamePasswordInSharedPrefs(username, password);
    launchMapActivity(authInfo);
}