@java.lang.Override
public void onClick(android.view.View v) {
    if ((duringDetail.getVisibility()) == (android.view.View.GONE)) {
        duringDetail.setVisibility(View.VISIBLE);
        duringDetail.startAnimation(fadeIn);
    }else {
        duringDetail.setVisibility(View.GONE);
        duringDetail.startAnimation(fadeOut);
    }
}