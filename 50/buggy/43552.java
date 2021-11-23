public void setOnSelectListener(com.zhy.view.flowlayout.TagFlowLayout.OnSelectListener onSelectListener) {
    mOnSelectListener = onSelectListener;
    if ((mOnSelectListener) != null)
        setClickable(true);
    
}