@android.support.annotation.Nullable
@java.lang.Override
@android.support.annotation.CallSuper
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    final android.view.View fragmentView = inflater.inflate(getLayoutResource(), container);
    butterknife.ButterKnife.bind(fragmentView);
    return fragmentView;
}