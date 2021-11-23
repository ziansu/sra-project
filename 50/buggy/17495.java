@java.lang.Override
public void onClick(android.view.View v) {
    if ((getOnItemClickListener()) != null) {
        getOnItemClickListener().onItemClick(this, v, ((baseViewHolder.getLayoutPosition()) - (getHeaderLayoutCount())));
    }
}