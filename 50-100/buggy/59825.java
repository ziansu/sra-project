@java.lang.Override
public void onClick(android.view.View view) {
    int o = ((int) (view.getTag()));
    com.russell.calmmusic.services.imp.MusicServicesImp.mediaPlayer = new android.media.MediaPlayer();
    musicServicesImp.initMediaPlayer(o);
    android.content.Intent intent = new android.content.Intent();
    android.os.Bundle bundle = new android.os.Bundle();
    intent.setClass(getActivity(), com.russell.calmmusic.activities.PlayingActivity.class);
    bundle.putInt("tag", o);
    intent.putExtras(bundle);
    startActivity(intent);
}