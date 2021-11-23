@java.lang.Override
public void onAnimationEnd(android.view.View view) {
    super.onAnimationEnd(view);
    getFloatingToolbar().setVisibility(View.INVISIBLE);
    android.support.v4.view.ViewCompat.animate(getFloatingToolbar()).setListener(null);
    getAnimationListener().onAnimationFinished();
}