public void editText(final java.lang.String clips) {
    android.content.Intent i = new android.content.Intent(this, com.catchingnow.tinyclipboardmanager.ActivityEditor.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK).putExtra(com.catchingnow.tinyclipboardmanager.ClipObjectActionBridge.STATUE_IS_STARRED, intent.getBooleanExtra(com.catchingnow.tinyclipboardmanager.ClipObjectActionBridge.STATUE_IS_STARRED, false)).putExtra(Intent.EXTRA_TEXT, clips);
    startActivity(i);
}