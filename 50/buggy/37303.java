@java.lang.Override
public int getItemCount() {
    if (data.isEmpty())
        return 1;
    
    if ((data) == null)
        return 0;
    
    return data.size();
}