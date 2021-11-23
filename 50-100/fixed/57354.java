@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_search, container, false);
    butterknife.ButterKnife.bind(this, rootView);
    ((android.support.v7.app.AppCompatActivity) (getActivity())).setSupportActionBar(mToolbar);
    mToolbar.setContentInsetsAbsolute(0, 0);
    mToolbar.setContentInsetsRelative(0, 0);
    return rootView;
}