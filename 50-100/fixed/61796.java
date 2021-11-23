@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    if (position == 0) {
        convertView = inflater.inflate(R.layout.zero_size_layout, parent, false);
    }else {
        convertView = inflater.inflate(R.layout.row_spinner, parent, false);
    }
    return convertView;
}