@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    if (endSize == 0) {
        android.util.Log.e("Yann", "end size is 0");
        imgPicture.setVisibility(View.GONE);
    }
}