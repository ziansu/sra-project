@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    if (com.aidanas.torch.Const.DEBUG)
        android.util.Log.v(com.aidanas.torch.fragments.StrobeFragment.TAG, "In onAttach()");
    
    try {
        mListener = ((com.aidanas.torch.fragments.StrobeFragment.OnStrobeFragmentInteractionListener) (context));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException(((context.toString()) + " must implement OnMainFragmentInteractionListener"));
    }
}