@java.lang.Override
public void onClick(android.view.View v) {
    if (((getOnItemClickListener()) != null) && (baseViewHolder != null)) {
        getOnItemClickListener().onItemClick(this, v, ((baseViewHolder.getLayoutPosition()) - (getHeaderLayoutCount())));
    }
}