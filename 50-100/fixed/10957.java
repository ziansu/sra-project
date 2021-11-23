public void init() {
    library.activity.VinhNT_Common.init();
    icon = new android.widget.ImageView(this);
    icon.setImageResource(R.mipmap.icon_default);
    requestHTTP = new library.connect.VinhNT_HTTP(this);
    android.widget.LinearLayout mainView = new android.widget.LinearLayout(this);
    setContentView(mainView);
    mainView.setOrientation(LinearLayout.VERTICAL);
    library.activity.VinhNT_Header header = new library.activity.VinhNT_Header(this);
    mainView.addView(header, VinhNT_Common.size_10_per_HORIZONTAL);
    mainView.addView(getContent(), VinhNT_Common.size_80_per_HORIZONTAL);
    mainView.addView(getFooter(), VinhNT_Common.size_10_per_HORIZONTAL);
}