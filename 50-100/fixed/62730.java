@java.lang.Override
public void onViewCreated(final android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    headerWvEnhanced.setVisibility(View.GONE);
    stepQualityPresenter.attachView(this);
    videoStepPresenter.attachView(this);
    videoLengthPresenter.attachView(this);
    videoStepPresenter.initVideo(step);
    player.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            player.setClickable(false);
            videoStepPresenter.playVideo(step);
        }
    });
}