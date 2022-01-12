@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
private void setupWindowAnimations() {
    android.transition.Explode explode = new android.transition.Explode();
    explode.setDuration(500);
    explode.excludeTarget(android.R.id.statusBarBackground, true);
    explode.excludeTarget(android.R.id.navigationBarBackground, true);
    getWindow().setEnterTransition(explode);
    android.transition.Slide slide = new android.transition.Slide();
    slide.setDuration(200);
    slide.setSlideEdge(Gravity.END);
    slide.excludeTarget(android.R.id.statusBarBackground, true);
    slide.excludeTarget(android.R.id.navigationBarBackground, true);
    getWindow().setReturnTransition(slide);
}