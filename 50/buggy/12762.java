@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        com.bdqn.zev.videowallpaperdemo.VideoLiveWallpaper.voiceSilence(this);
    }else {
        com.bdqn.zev.videowallpaperdemo.VideoLiveWallpaper.voiceNormal(this);
    }
}