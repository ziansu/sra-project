@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    int color = ((int) (com.github.ybq.android.loading.ArgbEvaluator.getInstance().evaluate(positionOffset, colors[position], colors[(position + 1)])));
    getWindow().getDecorView().setBackgroundColor(color);
}