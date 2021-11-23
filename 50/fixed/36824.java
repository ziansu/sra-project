@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.View vi = convertView;
    if (vi == null) {
        vi = inflater.inflate(R.layout.item_search_hospital, parent, false);
    }
    return vi;
}