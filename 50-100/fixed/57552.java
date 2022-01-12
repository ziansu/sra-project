@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreateView(inflater, container, savedInstanceState);
    context = getContext();
    rootView = new android.widget.FrameLayout(context);
    rootView = inflater.inflate(R.layout.collections_page, null);
    if (fetchViews()) {
        populateList();
    }
    return rootView;
}