@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    android.util.Log.i("TAG", "---- onAnimationEnd ----");
    view.setTranslationY(0);
}