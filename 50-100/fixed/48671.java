@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((mCurrentRadioStation) != null) {
        mIsPlaying = true;
        byte[] imageData = android.util.Base64.decode(mCurrentRadioStation.getIcon(), Base64.DEFAULT);
        mPlayerSelectedIcon.setImageBitmap(android.graphics.BitmapFactory.decodeByteArray(imageData, 0, imageData.length));
        mPlayerSelectedName.setText(mCurrentRadioStation.getName());
        mPlayerControl.setImageResource(R.drawable.ic_pause_24dp);
        mTbPlayer.setVisibility(View.VISIBLE);
    }
}