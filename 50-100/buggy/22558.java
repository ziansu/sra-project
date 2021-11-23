public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    layout = ((android.widget.LinearLayout) (inflater.inflate(R.layout.recording_fragment, container)));
    prepareButtons();
    prepareText();
    setWindowSize();
    fileName = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
    fileName += FILE_EXT;
    return layout;
}