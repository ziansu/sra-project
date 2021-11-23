@java.lang.Override
public void onClick(android.view.View v) {
    if (ma.isSuffle()) {
        ma.setSuffle(false);
        btnMdfSuffle.setBackground(android.support.v4.content.res.ResourcesCompat.getDrawable(getResources(), R.drawable.mediaplayer_suffle_ic, null));
    }else {
        ma.setSuffle(true);
        btnMdfSuffle.setBackground(android.support.v4.content.res.ResourcesCompat.getDrawable(getResources(), R.drawable.mediaplayer_pressedsuffle_ic, null));
    }
}