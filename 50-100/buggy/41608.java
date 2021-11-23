@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(this, "Loading map....", Toast.LENGTH_SHORT).show();
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        android.transition.TransitionManager.beginDelayedTransition(mLoadingViews, new android.transition.Slide(android.view.Gravity.RIGHT));
    }
    if (mContainsMapFrag) {
        createNewMapFrag();
    }else {
        android.content.Intent intent = new android.content.Intent(this, com.wordpress.chrissebesta.nyccyclemap.NewMapActivity.class);
        if ((mSavedCameraPosition) != null) {
            intent.putExtra("arg camera position", mSavedCameraPosition);
        }
        startActivity(intent);
    }
}