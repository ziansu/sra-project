@java.lang.Override
public void onClick(android.view.View v) {
    if ((onItemClickListener) != null) {
        int p = getAdapterPosition();
        if (p >= 0)
            onItemClickListener.onItemClick(v, p);
        
    }
}