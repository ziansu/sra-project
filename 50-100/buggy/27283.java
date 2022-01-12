private int getMode() {
    final int rotation = ((android.view.WindowManager) (this.getSystemService(Context.WINDOW_SERVICE))).getDefaultDisplay().getRotation();
    log(("Rotation = " + rotation));
    switch (rotation) {
        case android.view.Surface.ROTATION_90 :
        case android.view.Surface.ROTATION_270 :
            return com.vamsisangam.androidexamples.fragments.CourseFragmentsActivity.PORTRAIT;
    }
    return com.vamsisangam.androidexamples.fragments.CourseFragmentsActivity.LANDSCAPE;
}