@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    if ((greyFavIcon.getVisibility()) == (android.view.View.GONE)) {
        greyFavIcon.setVisibility(View.VISIBLE);
        orangeFavIcon.setVisibility(View.GONE);
        circleBackground.setVisibility(View.GONE);
        com.example.aishwarya.favoriteicon.AnimationUtils.heart(circleBackground, greyFavIcon, orangeFavIcon);
    }else {
        com.example.aishwarya.favoriteicon.AnimationUtils.heart(circleBackground, greyFavIcon, orangeFavIcon);
    }
    return true;
}