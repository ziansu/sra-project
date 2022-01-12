public void updateFragment(int position, com.example.guhao.myweather.fragment.SingleCityFragment fragment, com.example.guhao.myweather.bean.WeatherEntity entity) {
    if ((list.size()) > 0) {
        if ((position == 0) || (position == 1)) {
            setInfo(position, entity);
        }else {
            list.set(position, fragment);
        }
        notifyDataSetChanged();
    }else {
        addFragment(fragment);
        notifyDataSetChanged();
    }
}