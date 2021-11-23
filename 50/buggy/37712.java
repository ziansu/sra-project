@java.lang.Override
public void onClick(android.view.View v) {
    v.setTag(com.srmarlins.weather.ui.adapter.WeatherRecyclerAdapter.VIEW_KEY, info);
    onClickSubject.onNext(v);
}