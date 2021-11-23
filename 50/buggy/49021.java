@java.lang.Override
public void onClick(android.view.View v) {
    if ((itemClickListener) != null)
        itemClickListener.onItemClick(null, itemView, position, 0);
    
}