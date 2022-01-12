@java.lang.Override
public long getItemId(int position) {
    synchronized(data) {
        if (position < (data.size()))
            return data.get(position).eid;
        else
            return -1;
        
    }
}