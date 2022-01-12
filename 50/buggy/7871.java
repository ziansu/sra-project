@java.lang.Override
protected java.lang.Long doInBackground(java.lang.String... params) {
    try {
        java.lang.Thread.sleep((1000 * 3));
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    list = listOfSongs(getActivity());
    return null;
}