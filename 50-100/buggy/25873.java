@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    final android.view.View view = inflater.inflate(R.layout.fragment_settings, container, false);
    unbinder = butterknife.ButterKnife.bind(this, view);
    mPicasso = com.squareup.picasso.Picasso.with(getActivity());
    mPresenter.loadProfileImage();
    return view;
}