@java.lang.Deprecated
protected android.view.View getViewInternal(int position, android.view.View convertView, android.view.ViewGroup container) {
    if ((getItemCount()) == 0)
        return null;
    
    return getView((position % (getItemCount())), convertView, container);
}