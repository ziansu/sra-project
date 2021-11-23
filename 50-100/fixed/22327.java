private void setupEditTextMessage(final com.dmm.leavemanagementsystem.models.LeaveRequest request) {
    etMessageRequest = ((android.widget.EditText) (alertLayout.findViewById(R.id.et_message_request)));
    etMessageRequest.setText(((request.getMessage()) == null ? "" : request.getMessage()));
}