public void setViewsToUse(@android.support.annotation.LayoutRes
int layoutResId, @android.support.annotation.IdRes
int bubbleResId, @android.support.annotation.IdRes
int handleResId) {
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(getContext());
    inflater.inflate(layoutResId, this, true);
    bubble = ((android.widget.TextView) (findViewById(bubbleResId)));
    if ((bubble) != null)
        bubble.setVisibility(eu.davidea.fastscroller.INVISIBLE);
    
    handle = ((android.widget.ImageView) (findViewById(handleResId)));
}