public void setCardBackBackground(@android.support.annotation.DrawableRes
int cardBackBackground) {
    this.mCardBackBackground = cardBackBackground;
    setBackgroundResource(mCardBackBackground);
    redrawViews();
}