@java.lang.Override
public void onClick(android.view.View v) {
    title[0] = title[1];
    ringtoneTextView.setText(title[0]);
    stopMediaPlayer(mp);
    dialog.dismiss();
}