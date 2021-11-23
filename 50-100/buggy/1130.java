@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_user_detailworks, container, false);
    android.util.Log.d("test", "test");
    setUpView(v);
    pool.execute(fetchData(true));
    return v;
}