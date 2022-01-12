@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if (((getOnItemLongClickListener()) != null) && (baseViewHolder != null)) {
        return getOnItemLongClickListener().onItemLongClick(this, v, ((baseViewHolder.getLayoutPosition()) - (getHeaderLayoutCount())));
    }
    return false;
}