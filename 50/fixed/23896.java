@java.lang.Override
public void onPause() {
    super.onPause();
    com.fsck.k9.controller.MessagingController.getInstance(getApplication()).removeListener(mListener);
}