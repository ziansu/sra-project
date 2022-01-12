@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_product_details, container, false);
    unbinder = butterknife.ButterKnife.bind(this, view);
    if ((mNotifyListener) != null) {
        mNotifyListener.hideActionbar();
    }
    return view;
}