@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    int layoutId;
    if ((position % 2) == 0) {
        layoutId = R.layout.row_left_icon;
    }else {
        layoutId = R.layout.row_right_icon;
    }
    android.view.View row = inflater.inflate(layoutId, parent, false);
    android.widget.TextView txtCityName = ((android.widget.TextView) (row.findViewById(R.id.city_name)));
    com.nacho.weatherworld.model.City city = this.cities.get(position);
    txtCityName.setText(city.getName());
    return row;
}