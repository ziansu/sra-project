@java.lang.Override
public void onClick(android.view.View v) {
    resetColorAndBackground(index);
    btnSelected(v, index);
    mPager.setCurrentItem(index);
}