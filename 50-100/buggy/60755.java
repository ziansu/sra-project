@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    if (context instanceof com.joncatanio.billme.DashboardFragment.OnFragmentInteractionListener) {
        mListener = ((com.joncatanio.billme.DashboardFragment.OnFragmentInteractionListener) (context));
    }else {
        throw new java.lang.RuntimeException(((context.toString()) + " must implement OnFragmentInteractionListener"));
    }
}