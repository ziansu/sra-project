@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    final android.view.View rootView = inflater.inflate(R.layout.fragment_controls, null);
    butterknife.ButterKnife.bind(rootView);
    nextButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            mCallBack.onNextButtonClicked();
        }
    });
    previousButton.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            mCallBack.onPreviousButtonClicked();
        }
    });
    return rootView;
}