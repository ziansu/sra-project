@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.util.Log.v(TAG, "onActivityCreated()");
    android.content.Context context;
    context = getContext();
    if (context instanceof android.view.View.OnClickListener)
        mContentView.setOnClickListener(((android.view.View.OnClickListener) (context)));
    
    if (mHasArt)
        mContentView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    
    displaySongInfo();
    mMediaBrowser = new android.support.v4.media.MediaBrowserCompat(getContext(), MediaPlayerService.COMPONENT_NAME, mConnectionCallbacks, null);
}