@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    android.util.Log.d(org.eyeseetea.malariacare.fragments.DashboardSentFragment.TAG, "onActivityCreated");
    super.onActivityCreated(savedInstanceState);
    initAdapter();
    initListView();
}