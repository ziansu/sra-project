@java.lang.Override
public void onViewDetachedFromWindow(VH holder) {
    if ((decoratedAdapter) != null)
        decoratedAdapter.onViewDetachedFromWindow(holder);
    
}