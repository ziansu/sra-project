@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.View vi = convertView;
    if (vi == null) {
        if (position < (mDoctors.length)) {
            vi = inflater.inflate(R.layout.item_search_doctor, parent, false);
        }else {
            vi = inflater.inflate(R.layout.item_search_doctor_add, parent, false);
        }
    }
    return vi;
}