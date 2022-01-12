@java.lang.Override
public void onClick(android.view.View v) {
    if ((duringDetail.getVisibility()) == (android.view.View.GONE)) {
        duringDetail.setVisibility(View.VISIBLE);
        beforeDetail.startAnimation(fadeIn);
    }else {
        duringDetail.setVisibility(View.GONE);
        beforeDetail.startAnimation(fadeOut);
    }
}