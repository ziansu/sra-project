@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreateView(inflater, container, savedInstanceState);
    rootView = new android.widget.FrameLayout(getContext());
    rootView = inflater.inflate(R.layout.collections_page, null);
    fetchViews();
    populateList();
    return rootView;
}