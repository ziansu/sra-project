public void setExpanderView(int resId) {
    mExpanderView = ((android.view.View) (getParent())).findViewById(resId);
    if ((mExpanderView) != null) {
        mExpanderView.setVisibility((mExpanderNeeded ? VISIBLE : GONE));
        mExpanderView.setOnClickListener(new ds.framework.v4.widget.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                start();
            }
        });
        setOnClickListener(new ds.framework.v4.widget.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                start();
            }
        });
    }
}