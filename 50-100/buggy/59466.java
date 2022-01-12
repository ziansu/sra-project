@java.lang.Override
protected void initLayout() {
    android.view.LayoutInflater inflater = getLayoutInflater();
    normalView = inflater.inflate(R.layout.layout_ecg_normal, null);
    noPairView = inflater.inflate(R.layout.layout_ecg_nopair, null);
    normalECGSurfaceView = ((com.uestc.hb.ecg.NormalECGSurfaceView) (normalView.findViewById(R.id.surfaceview1)));
    nopairButton1 = ((android.widget.Button) (noPairView.findViewById(R.id.button1)));
    nopairButton2 = ((android.widget.Button) (noPairView.findViewById(R.id.button2)));
    normalButton = ((android.widget.Button) (normalButton.findViewById(R.id.button1)));
}