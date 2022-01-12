@java.lang.Override
public void setOnClickListener(view.sxdxz.liao.xingyu.view.OnClickListener l) {
    for (int i = (hasTitle) ? 1 : 0, count = getChildCount(); i < count; i++) {
        android.view.View child = getChildAt(i);
        child.setOnClickListener(l);
    }
}