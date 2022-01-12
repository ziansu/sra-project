@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if ((mView) == null) {
        mView = inflater.inflate(R.layout.fragment_ad_view, container, false);
        butterknife.ButterKnife.bind(this, mView);
        init();
    }
    android.view.ViewGroup parent = ((android.view.ViewGroup) (mView.getParent()));
    if (parent != null) {
        parent.removeView(mView);
    }
    return mView;
}