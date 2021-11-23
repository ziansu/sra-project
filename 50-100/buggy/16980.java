@java.lang.Override
public void onClick(android.view.View view) {
    getDark(latLong);
    if ((isClickedThree) == true) {
        mSummaryTextView.setVisibility(View.INVISIBLE);
        isClickedThree = false;
    }else
        if ((isClickedThree) == false) {
            mSummaryTextView.setVisibility(View.VISIBLE);
            isClickedThree = true;
        }
    
    if ((isClickedFour) == true) {
        mRecyclerViewSeven.setVisibility(View.INVISIBLE);
    }else
        if ((isClickedFour) == false) {
            mRecyclerViewSeven.setVisibility(View.VISIBLE);
            isClickedFour = true;
        }
    
}