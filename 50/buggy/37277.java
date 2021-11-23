@java.lang.Override
public int getItemCount() {
    if ((notes) != null)
        return (notes.size()) + 1;
    else
        return 1;
    
}