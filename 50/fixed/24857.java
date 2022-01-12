@java.lang.Override
public long getItemId(int position) {
    if ((ids.size()) > position)
        return ids.get(position);
    else
        return -1;
    
}