@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_product_details, container, false);
    unbinder = butterknife.ButterKnife.bind(this, view);
    if ((mNotifyListener) != null) {
        mNotifyListener.hideActionbar();
    }
    btnAddToCart.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            getActivity().getSupportFragmentManager().popBackStackImmediate();
        }
    });
    return view;
}