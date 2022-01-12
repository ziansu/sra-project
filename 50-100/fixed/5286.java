@android.annotation.TargetApi(value = Build.VERSION_CODES.M)
@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View rootview = inflater.inflate(R.layout.fragment_mill, container, false);
    loadViews(rootview);
    initializeCounters();
    setOnClicks();
    updateValues(true);
    addAdStuff(rootview);
    return rootview;
}