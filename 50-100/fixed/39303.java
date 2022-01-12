@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((getIntent()) != null) {
        int position = getIntent().getIntExtra(Constant.ARG_SELECTED_POSITION, (-1));
        if (position > (-1)) {
            mSelectedTabPosition = position;
            setContentMain(mShowType, mSelectedArea);
            onTabSelected(mSelectedTabPosition);
        }
    }
}