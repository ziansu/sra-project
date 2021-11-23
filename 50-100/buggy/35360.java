@java.lang.Override
public void onClick(android.view.View view) {
    for (android.view.View v : views) {
        v.setBackgroundColor(Color.TRANSPARENT);
    }
    if (view instanceof android.widget.TextView) {
        android.animation.ObjectAnimator animBgFadeIn = android.animation.ObjectAnimator.ofObject(view, "backgroundColor", new android.animation.ArgbEvaluator(), android.graphics.Color.parseColor(colorDarkGray), android.graphics.Color.parseColor(colorGreen));
        animBgFadeIn.setDuration(75);
        animBgFadeIn.start();
        rootView.closeDrawer(GravityCompat.START);
    }
}