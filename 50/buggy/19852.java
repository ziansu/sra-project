@java.lang.Override
public int getItemCount() {
    if ((mWeatherData) == null) {
        return 0;
    }else {
        return mWeatherData.length;
    }
}