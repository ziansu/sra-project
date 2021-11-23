@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View mainView = inflater.inflate(getLayoutResId(), container, false);
    butterknife.ButterKnife.bind(this, mainView);
    return mainView;
}