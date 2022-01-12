@java.lang.Override
public void onDestroyView() {
    android.util.Log.d(mclab1.pages.MediaPlayerFragment.tag, ("height = " + (mclab1.pages.MediaPlayerFragment.controller.getHeight())));
    mclab1.pages.MediaPlayerFragment.controller.removeAllViews();
    super.onDestroyView();
}