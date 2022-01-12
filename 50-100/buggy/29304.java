@java.lang.Override
protected java.lang.Object doInBackground(java.lang.Object[] objects) {
    ecez.vndbapp.view.vndatabaseapp.loggedIn = ecez.vndbapp.model.ServerRequest.getInstance().login();
    java.util.List<ecez.vndbapp.view.TopNovelsFragment> fragments = mPagerAdapter.getFragmentList();
    android.util.Log.d("Fragment2", (("THere are " + (fragments.size())) + " fragments"));
    for (ecez.vndbapp.view.TopNovelsFragment f : fragments) {
        android.util.Log.d("Fragment", "Updating a fragment");
        f.loadList(true);
    }
    return true;
}