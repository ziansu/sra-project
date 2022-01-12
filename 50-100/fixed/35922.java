@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.camera_layout, container, false);
    this.inflater = inflater;
    tts = new android.speech.tts.TextToSpeech(getActivity(), this);
    webView = ((android.webkit.WebView) (view.findViewById(R.id.web_view)));
    webView.getSettings().setDomStorageEnabled(true);
    webView.getSettings().setJavaScriptEnabled(true);
    webView.setOnTouchListener(this);
    startWebCamStream();
    return view;
}