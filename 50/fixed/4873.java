@java.lang.Override
public void executeCallbacks(int requestCode, int responseCode, android.content.Intent data) {
    mTwitterAuthClient.onActivityResult(requestCode, responseCode, data);
}