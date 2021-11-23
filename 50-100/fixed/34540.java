public void run() {
    mDisplay = ((android.widget.TextView) (findViewById(R.id.display)));
    mDisplay.append((("\n" + (getResources().getString(R.string.Message_from_admin_prefix))) + adminMsg));
    scrollToBottom(mDisplayScroll, mDisplay);
    android.net.Uri notification = android.media.RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
    android.media.Ringtone r = android.media.RingtoneManager.getRingtone(getApplicationContext(), notification);
    r.play();
}