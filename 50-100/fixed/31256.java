@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    int color = ((int) (com.github.ybq.android.loading.ArgbEvaluator.getInstance().evaluate(positionOffset, colors[(position % (colors.length))], colors[((position + 1) % (colors.length))])));
    getWindow().getDecorView().setBackgroundColor(color);
}