@java.lang.Override
public void onError() {
    android.util.Log.d(be.ugent.zeus.hydra.viewpager.ImagePagerAdapter.TAG, "Image error");
    progressBar.setVisibility(View.GONE);
}