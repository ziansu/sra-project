@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    android.animation.ArgbEvaluator evaluator = new android.animation.ArgbEvaluator();
    int color = ((int) (evaluator.evaluate((position + positionOffset), android.graphics.Color.parseColor(startColor), android.graphics.Color.parseColor(endColor))));
    colorDrawable.setColor(color);
    if (((mainActivity.mainFragment) != null) && (!(mainActivity.mainFragment.selection))) {
        mainActivity.updateViews(colorDrawable);
    }
}