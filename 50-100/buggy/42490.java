@java.lang.Override
public void onPageSelected(int position) {
    position = position % (mData.size());
    for (int i = 0; i < (mData.size()); i++) {
        android.view.View indicatorView = mContainerIndicator.getChildAt(i);
        indicatorView.setBackgroundResource(R.drawable.indicator_normal);
        if (i == position) {
            indicatorView.setBackgroundResource(R.drawable.indicator_selected);
        }else {
            indicatorView.setBackgroundResource(R.drawable.indicator_normal);
        }
    }
}