public void next_music() {
    android.content.Intent intent = new android.content.Intent();
    intent.setAction("fm.poche.media.MUSIC_SERVICE");
    intent.putExtra("MSG", AppConstant.PlayerMsg.NEXT_MSG);
    intent.putExtra("TRACKS", tracks);
    intent.setPackage(((android.app.Activity) (mContext)).getPackageName());
    mContext.startService(intent);
}