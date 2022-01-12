@java.lang.Override
public void onClick(android.view.View v) {
    if ((tip7Detail.getVisibility()) == (android.view.View.GONE)) {
        tip7Detail.setVisibility(View.VISIBLE);
        tip7Detail.startAnimation(fadeIn);
    }else {
        tip7Detail.setVisibility(View.GONE);
        tip7Detail.startAnimation(fadeOut);
    }
}