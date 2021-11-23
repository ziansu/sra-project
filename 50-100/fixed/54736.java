public void setPlayer(android.content.Context context, @android.support.annotation.Nullable
com.google.android.exoplayer2.source.ExtractorMediaSource mediaSource) {
    if (context instanceof com.amagh.bakemate.utils.ManageSimpleExoPlayerInterface) {
        this.player = ((com.amagh.bakemate.utils.ManageSimpleExoPlayerInterface) (context)).getPlayer();
    }
    this.mediaSource = mediaSource;
    if ((this.mediaSource) != null) {
        notifyPropertyChanged(BR.mediaSource);
    }else {
        visibility = android.view.View.GONE;
        notifyPropertyChanged(BR.visibility);
    }
}