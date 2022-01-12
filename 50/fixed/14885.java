@java.lang.Override
public void onAnimationEnd(android.view.View view) {
    getFloatingToolbar().setVisibility(View.INVISIBLE);
    getAnimationListener().onAnimationFinished();
    android.support.v4.view.ViewCompat.animate(getFloatingToolbar()).setListener(null);
}