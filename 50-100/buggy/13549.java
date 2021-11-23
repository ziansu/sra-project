@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.home_screen, container, false);
    getScreenManager().setTitleOfActionBar(getResources().getString(R.string.string_title_GMAT));
    inits(view);
    return view;
}