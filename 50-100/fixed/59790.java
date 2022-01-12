public void updateFragment(int position, com.example.guhao.myweather.fragment.SingleCityFragment fragment, com.example.guhao.myweather.bean.WeatherEntity entity) {
    if ((list.size()) > 0) {
        list.set(position, fragment);
        notifyDataSetChanged();
    }else {
        addFragment(fragment);
        notifyDataSetChanged();
    }
}