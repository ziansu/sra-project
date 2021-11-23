@java.lang.Override
public void onClick(android.view.View view) {
    if ((onItemClickListener) != null) {
        onItemClickListener.onItemClick(binding, io.simi.widget.RecyclerViewHolder.getAdapterPosition());
    }
}