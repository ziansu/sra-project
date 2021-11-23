@java.lang.Override
public void onClick(android.view.View view) {
    if ((clickListener) != null)
        clickListener.onClick(view, getAdapterPosition());
    
}