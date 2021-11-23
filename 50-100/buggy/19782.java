public chevalierx.kiwapp.utils.animations.AnimationHelper hideItem() {
    this.heigthView = this.itemView.getHeight();
    this.widthView = this.itemView.getWidth();
    this.isShow = false;
    initAnimation(getInitialHeigthView(), getInitialWidthView(), false);
    android.util.Log.i(chevalierx.kiwapp.utils.animations.AnimationHelper.class.getName(), "hideItem");
    startAnimation();
    return this;
}