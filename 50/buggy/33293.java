@java.lang.Override
public long getItemId(int position) {
    if (position < (data.size()))
        return data.get(position).eid;
    else
        return -1;
    
}