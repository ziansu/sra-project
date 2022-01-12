@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    presenter = new com.sean.nanastudio.taoyuanstreetparking.MainPresenterImpl(this, new com.sean.nanastudio.taoyuanstreetparking.MainModelImpl(this));
    presenter.onCreate();
}