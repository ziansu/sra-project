@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    if (convertView == null) {
        convertView = mLayoutInflater.inflate(R.layout.single_text_item, null);
        viewHolder = new com.abhinavsharma.imagetotext.ViewHolder();
        viewHolder.tvString = ((android.widget.TextView) (convertView.findViewById(R.id.tv_text)));
        convertView.setTag(viewHolder);
    }else
        viewHolder = ((com.abhinavsharma.imagetotext.ViewHolder) (convertView.getTag()));
    
    viewHolder.tvString.setText(getItem(position));
    return convertView;
}