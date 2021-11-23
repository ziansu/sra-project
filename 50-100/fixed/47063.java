@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_guide);
    naviInit();
    mAMapNaviView = ((com.amap.api.navi.AMapNaviView) (findViewById(R.id.navi_view)));
    mAMapNaviView.onCreate(savedInstanceState);
    mAMapNaviView.setAMapNaviViewListener(this);
    android.content.Intent intent = this.getIntent();
    EndLat = intent.getStringExtra("EndLat");
    EndLng = intent.getStringExtra("EndLng");
    mEndLatLng = new com.amap.api.navi.model.NaviLatLng(java.lang.Double.parseDouble(EndLat), java.lang.Double.parseDouble(EndLng));
}