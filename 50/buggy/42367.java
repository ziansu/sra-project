@java.lang.Override
public void run() {
    animation.stopAnimation();
    progressBar.setVisibility(View.VISIBLE);
    imgConnectionError.setVisibility(View.GONE);
    presenter.onFetchData();
}