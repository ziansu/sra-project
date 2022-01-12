@java.lang.Override
public void initViews() {
    com.easy.player.entity.POMedia poMedia = ((com.easy.player.entity.POMedia) (getIntent().getSerializableExtra("po_media")));
    io.vov.vitamio.utils.Log.mlj(("poMedia==" + poMedia));
    mVideoView = ((io.vov.vitamio.widget.VideoView) (findViewById(R.id.id_fullscreen_video_view)));
    mEasyMediaController = new com.easy.player.controller.EasyMediaController(this, this, mVideoView);
    mVideoView.setVideoPath(poMedia.path);
    mVideoView.setMediaController(mEasyMediaController);
    mVideoView.setVideoQuality(io.vov.vitamio.MediaPlayer.VIDEOQUALITY_HIGH);
    mVideoView.requestFocus();
    initPlugins();
}