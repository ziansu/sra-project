@java.lang.Override
public void onSendMessageSuccess() {
    if ((getActivity()) != null) {
        android.widget.Toast.makeText(getActivity(), R.string.message_send_success, Toast.LENGTH_SHORT).show();
    }
}