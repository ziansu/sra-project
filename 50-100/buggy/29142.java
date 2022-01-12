public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.View v = convertView;
    if (v == null) {
        android.view.LayoutInflater inflater = ((android.view.LayoutInflater) (getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
        v = inflater.inflate(R.layout.my_items_list_item);
    }
}