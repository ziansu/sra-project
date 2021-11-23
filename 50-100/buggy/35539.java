@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_numbers_main, container, false);
    initViews(rootView);
    com.varunest.numberfacts.NumbersMain.animator.onCreateAnimation(titleText, subtitleText, fullCrop, randomBtn, mathBtn, todayBtn, yearBtn, getFactsButton, croppedLayout);
    showAds(rootView);
    return rootView;
}