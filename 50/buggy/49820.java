public void setOnTagClickListener(com.zhy.view.flowlayout.TagFlowLayout.OnTagClickListener onTagClickListener) {
    mOnTagClickListener = onTagClickListener;
    if (onTagClickListener != null)
        setClickable(true);
    
}