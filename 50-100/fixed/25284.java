@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.util.Log.d(org.eyeseetea.malariacare.fragments.ReviewFragment.TAG, "onCreateView");
    this.lInflater = android.view.LayoutInflater.from(getActivity());
    mView = inflater.inflate(R.layout.review_layout, container, false);
    listView = ((android.widget.ListView) (mView.findViewById(R.id.review_list)));
    initializePresenter();
    initReviewButton(mView);
    return mView;
}