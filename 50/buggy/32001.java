@java.lang.Override
public java.lang.Object getItem(int position) {
    if (position < (data.size()))
        return data.get(position);
    else
        return null;
    
}