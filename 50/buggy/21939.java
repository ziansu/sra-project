@java.lang.Override
public void onPause() {
    super.onPause();
    com.android.EvtSpinner theSpinner = ((com.android.EvtSpinner) (mRootView.findViewById(R.id.spinner_didSomething)));
    theSpinner.setOnTouchListener(null);
    theSpinner.setOnItemSelectedListener(null);
    mListener = null;
}