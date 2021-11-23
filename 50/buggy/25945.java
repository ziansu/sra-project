@java.lang.Deprecated
protected android.view.View getViewInternal(int position, android.view.View convertView, android.view.ViewGroup container) {
    return getView((position % (getItemCount())), convertView, container);
}