@java.lang.Override
public void onClick(android.view.View v) {
    isYinpinPlaying = !(isYinpinPlaying);
    isJiangjiePlaying = false;
    ivJiangjie.setBackgroundResource(R.mipmap.ic_play_blue);
    if (isYinpinPlaying) {
        ivYinpin.setBackgroundResource(R.mipmap.ic_pause_blue);
        audioBinder.audioPlay(data.leftUri);
    }else {
        ivYinpin.setBackgroundResource(R.mipmap.ic_play_blue);
        audioBinder.audioPause();
    }
}