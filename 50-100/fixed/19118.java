@java.lang.Override
public void setGreenArrowToVisible(com.workew.mypair.VisibleItemClickedListener listener) {
    android.view.ViewGroup parent = ((android.view.ViewGroup) (mContainer.getChildAt(0)));
    android.widget.ViewAnimator greenArrow = ((android.widget.ViewAnimator) (parent.findViewById(R.id.green_arrow)));
    android.view.animation.Animation alpha = new android.view.animation.AlphaAnimation(0, 1);
    alpha.setDuration(1000);
    if (greenArrow != null) {
        greenArrow.startAnimation(alpha);
        greenArrow.setVisibility(View.VISIBLE);
        greenArrow.setOnClickListener(listener);
    }
}