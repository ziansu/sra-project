public org.opendroidphp.app.tasks.ProgressDialogTask setMessage(java.lang.String message) {
    this.message = message;
    if ((tv_message) != null) {
        tv_message.setText(message);
    }
    return this;
}