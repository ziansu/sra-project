@java.lang.Override
public int getItemViewType(int position) {
    int viewType;
    if ((position == 0) && (!(mTwoPane))) {
        viewType = com.upenn.chriswang1990.sunshine.ForecastAdapter.VIEW_TYPE_TODAY;
    }else
        if (((selectedPosition) == position) && (mTwoPane)) {
            viewType = com.upenn.chriswang1990.sunshine.ForecastAdapter.VIEW_TYPE_SELECTED;
        }else {
            viewType = com.upenn.chriswang1990.sunshine.ForecastAdapter.VIEW_TYPE_FUTURE_DAY;
        }
    
    return viewType;
}