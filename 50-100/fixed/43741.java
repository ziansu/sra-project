public void onClick(android.content.DialogInterface dialog, int id) {
    if ((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.LOLLIPOP)) {
        android.app.ActivityOptions options = android.app.ActivityOptions.makeSceneTransitionAnimation(this);
        android.transition.Slide slide = new android.transition.Slide();
        slide.setDuration(1000);
        getWindow().setExitTransition(slide);
    }
    finish();
}