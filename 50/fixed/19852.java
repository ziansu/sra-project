@java.lang.Override
public int getItemCount() {
    if (null == (mWeatherData))
        return 0;
    
    return mWeatherData.length;
}