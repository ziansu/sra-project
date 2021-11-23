@java.lang.Override
public com.example.lisamwatkins.sunshine.ForecastAdapter.ForecastViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int viewType) {
    int layoutId;
    switch (viewType) {
        case com.example.lisamwatkins.sunshine.ForecastAdapter.VIEW_TYPE_TODAY :
            layoutId = R.layout.list_item_forecast_today;
            break;
        case com.example.lisamwatkins.sunshine.ForecastAdapter.VIEW_TYPE_FUTURE_DAY :
            layoutId = R.layout.weather_list_item;
            break;
        default :
            throw new java.lang.IllegalArgumentException("View does not exist");
    }
    android.view.View view = android.view.LayoutInflater.from(mContext).inflate(layoutId, viewGroup, false);
    view.setFocusable(true);
    return new com.example.lisamwatkins.sunshine.ForecastAdapter.ForecastViewHolder(view);
}