@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return com.example.gil.myweather.weather.control.WeatherFragment.newInstance(1);
        case 1 :
            return com.example.gil.myweather.weather.control.WeatherFragment.newInstance(2);
        case 2 :
            return com.example.gil.myweather.weather.ui.WeatherListFragment.newInstance(10);
        default :
            return com.example.gil.myweather.weather.control.WeatherFragment.newInstance(1);
    }
}