@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    if ((rootView) == null) {
        rootView = inflater.inflate(R.layout.mv_viewpager_item_fragment, container, false);
        android.os.Bundle bundle = getArguments();
        areaCode = bundle.getString("areaCode");
        boserverView();
        butterknife.ButterKnife.bind(this, rootView);
        load();
    }else {
        butterknife.ButterKnife.bind(this, rootView);
    }
    butterknife.ButterKnife.bind(this, rootView);
    return rootView;
}