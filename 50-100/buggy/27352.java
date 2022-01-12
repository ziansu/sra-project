public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.LayoutInflater inflater = ((android.view.LayoutInflater) (context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE)));
    if (convertView == null) {
        convertView = inflater.inflate(R.layout.time_item, parent, false);
        bredesh.medico.Camera.TimeAdapter.ViewHolder viewHolder = new bredesh.medico.Camera.TimeAdapter.ViewHolder();
        final java.lang.String item = arrayList.get(position);
        setItemsView(convertView, viewHolder, item);
        convertView.setTag(viewHolder);
    }else
        convertView.getTag();
    
    return convertView;
}