@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    setTitleActivity();
    android.view.View view = inflater.inflate(R.layout.fragment_riepilogo, container, false);
    riempiTableCaratteristiche(view);
    riempiTabellaRegoleDiSoddisfazione(view);
    setButtons();
    setGoButtonListener();
    return view;
}