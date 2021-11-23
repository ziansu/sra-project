@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_stream, container, false);
    butterknife.ButterKnife.inject(app.rackdon.com.securitycam.StreamActivity.class, rootView);
    return rootView;
}