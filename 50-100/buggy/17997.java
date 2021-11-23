public chevalierx.kiwapp.utils.animations.AnimationHelper showItem(int height, int width) {
    this.heigthView = height;
    this.widthView = width;
    this.isShow = true;
    initAnimation(height, width, true);
    android.util.Log.i(chevalierx.kiwapp.utils.animations.AnimationHelper.class.getName(), "showItem");
    startAnimation();
    return this;
}