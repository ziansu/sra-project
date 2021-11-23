@java.lang.Override
public void onLayout(boolean changed, int l, int t, int r, int b) {
    if ((pullView) != null)
        super.onLayout(changed, l, t, r, (b + (pullView.getMeasuredHeight())));
    else
        super.onLayout(changed, l, t, r, b);
    
}