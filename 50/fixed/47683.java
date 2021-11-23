@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.item_full_screen_image, container, false);
    initUI(rootView);
    initSupportActionBar(rootView);
    return rootView;
}