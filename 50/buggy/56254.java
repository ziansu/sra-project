@java.lang.Override
public void onDestroyView() {
    if ((mBound) == true)
        getActivity().unbindService(mConnection);
    
    super.onDestroyView();
}