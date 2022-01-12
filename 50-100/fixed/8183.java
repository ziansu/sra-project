@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootview = inflater.inflate(R.layout.fragment_contact_select, container, false);
    butterknife.ButterKnife.bind(this, rootview);
    childContactAdapter = new com.hackahealth.kodakesalem.mvp.ui.adapter.ChildContactAdapter(getActivity(), new java.util.ArrayList<com.hackahealth.kodakesalem.mvp.objects.ChildContact>(), new com.hackahealth.kodakesalem.mvp.ui.ContactSelectFragment.CallbackClass() {
        @java.lang.Override
        public void onItemClick(int position) {
            presenter.onItemSelected(position);
        }
    });
    return rootview;
}