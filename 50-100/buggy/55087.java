@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if ((null == (rootView)) || (cacheContentData)) {
        rootView = onCreateFragmentView(inflater, container, savedInstanceState);
    }
    unbinder = butterknife.ButterKnife.bind(this, rootView);
    return rootView;
}