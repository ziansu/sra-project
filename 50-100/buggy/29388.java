@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    fragView = inflater.inflate(R.layout.predicting, container, false);
    super.onCreate(savedInstanceState);
    initScreen();
    try {
        loadData();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    initPrediction();
    return fragView;
}