@java.lang.Override
public int getItemViewType(int position) {
    synchronized(data) {
        return data.get(position).row_type;
    }
}