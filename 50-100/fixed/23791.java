@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        java.util.concurrent.TimeUnit.SECONDS.sleep(2);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    if ((getActivity()) != null) {
        getActivity().getFragmentManager().popBackStack();
    }
    return null;
}