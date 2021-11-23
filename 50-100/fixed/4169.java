@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_read, container, false);
    jsv = v.findViewById(R.id.read_fragment_jscrollview);
    gestureListener = new com.koroshiya.listeners.GestureListener(jsv, this);
    jsv.setOnTouchListener(gestureListener);
    readBundleArgs(savedInstanceState);
    return v;
}