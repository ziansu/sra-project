@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View root = inflater.inflate(R.layout.activity_main, container, false);
    com.wq.android.lightannotation.Injector.inject(this);
    return root;
}