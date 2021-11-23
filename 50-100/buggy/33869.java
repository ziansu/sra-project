protected void setOthersVisible(boolean visible) {
    if ((linearLayoutBall) != null) {
        linearLayoutBall.setVisibility((visible ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    }
    if ((gridViewPrize) != null) {
        gridViewPrize.setVisibility((visible ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    }
    if ((buttonRandom) != null) {
        buttonRandom.setVisibility((visible ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    }
}