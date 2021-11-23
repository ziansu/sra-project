@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.View vi = convertView;
    if (position < (mDoctors.length)) {
        vi = inflater.inflate(R.layout.item_search_doctor, null);
        vi.setClickable(true);
        vi.setFocusable(true);
    }else {
        vi = inflater.inflate(R.layout.item_search_doctor_add, null);
        vi.setClickable(true);
        vi.setFocusable(true);
    }
    return vi;
}