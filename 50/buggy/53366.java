@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if (container == null) {
        return null;
    }
    setHasOptionsMenu(true);
    return inflater.inflate(R.layout.activity_feed, null);
}