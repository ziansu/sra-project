public void initData() {
    if ((getArguments()) != null) {
        this.entity = ((com.example.guhao.myweather.bean.WeatherEntity) (getArguments().getSerializable("weather")));
        initView();
    }
    scrollView.setOnScrollChangeListener(new android.view.View.OnScrollChangeListener() {
        @java.lang.Override
        public void onScrollChange(android.view.View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
            listener.setRefresh((scrollY == 0));
        }
    });
}