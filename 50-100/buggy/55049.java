@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View decorView = getActivity().getWindow().getDecorView();
    int uiOptions = android.view.View.SYSTEM_UI_FLAG_FULLSCREEN;
    decorView.setSystemUiVisibility(uiOptions);
    view = inflater.inflate(R.layout.camera, container, false);
    setLayout();
    return view;
}