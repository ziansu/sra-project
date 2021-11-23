@java.lang.Override
public void onPause() {
    super.onPause();
    saveIfNeeded();
    com.fsck.k9.controller.MessagingController.getInstance(getApplication()).removeListener(mListener);
}