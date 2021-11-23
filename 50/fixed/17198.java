@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    addChildren();
    setOnClickListener(this);
    setOnEditorActionListener();
    setTextChangeListeners();
    if (isInEditMode())
        return ;
    
    inject();
}