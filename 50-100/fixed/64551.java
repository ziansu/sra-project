public void unbindPlayerService(android.support.v4.app.FragmentActivity activity) {
    if (isRegistered) {
        if (activity != null) {
            activity.unbindService(playerConnection);
        }else
            if ((getActivity()) != null) {
                getActivity().unbindService(playerConnection);
            }
        
        isRegistered = false;
    }
}