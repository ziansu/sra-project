@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    if (context instanceof com.q335.r49.squaredays.CalendarFrag.OnFragmentInteractionListener)
        mListener = ((com.q335.r49.squaredays.CalendarFrag.OnFragmentInteractionListener) (context));
    else
        throw new java.lang.RuntimeException(((context.toString()) + " must implement OnFragmentInteractionListener"));
    
    if ((fragView) != null) {
        com.q335.r49.squaredays.ScaleView tempV = ((com.q335.r49.squaredays.ScaleView) (fragView.findViewById(R.id.drawing)));
        if (tempV != null)
            mView = ((com.q335.r49.squaredays.ScaleView) (fragView.findViewById(R.id.drawing)));
        
    }
}