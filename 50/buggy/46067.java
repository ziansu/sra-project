@java.lang.Override
public void run() {
    updateRefresh(false);
    progressWrapper.setVisibility(View.GONE);
    ninjaWebView.setAlbumCover(io.github.mthli.Ninja.Unit.ViewUnit.capture(ninjaWebView, dimen144dp, dimen108dp));
}