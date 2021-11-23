private void doFinished() {
    android.widget.Toast.makeText(getApplicationContext(), "The video is finished!", Toast.LENGTH_SHORT).show();
    mMediaLoaded = false;
    mLogo.setVisibility(View.VISIBLE);
    mSurfaceView.setBackgroundColor(Color.BLACK);
    mContiner.setBackgroundColor(Color.BLACK);
}