protected void changeToPauseFragment() {
    try {
        android.os.Bundle bundle = new android.os.Bundle();
        fragment = cnr.partlinkclient.PauseFragment.newInstance(bundle);
    } catch (java.lang.Exception e) {
        android.util.Log.d(Utils.TAG, e.toString());
    }
    fragment.setGameCommunicationService(gcs);
    addFragment(fragment, container);
}