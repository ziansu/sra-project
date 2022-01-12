@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    if ((greyFavIcon.getVisibility()) == (android.view.View.GONE)) {
        com.example.aishwarya.favoriteicon.AnimationUtils.heart(circleBackground, orangeFavIcon, greyFavIcon);
    }else {
        com.example.aishwarya.favoriteicon.AnimationUtils.heart(circleBackground, greyFavIcon, orangeFavIcon);
    }
    return true;
}