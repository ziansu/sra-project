@java.lang.Override
public void onError() {
    android.util.Log.i(be.ugent.zeus.hydra.viewpager.ImagePagerAdapter.TAG, "Image error");
    progressBar.setVisibility(View.GONE);
}