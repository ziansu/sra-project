@java.lang.Override
public void onStop() {
    super.onStop();
    getActivity().unregisterReceiver(errorReceiver);
    if ((showDataFactory) != null)
        showDataFactory.stop();
    
    if ((podcastDataFactory) != null)
        podcastDataFactory.stop();
    
}