@android.annotation.TargetApi(value = Build.VERSION_CODES.KITKAT)
@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... voids) {
    return sendSMS(receiverId, msg);
}