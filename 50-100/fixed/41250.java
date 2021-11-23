public void refreshScreen(java.util.List<org.eyeseetea.malariacare.data.database.model.Survey> newListSurveys) {
    android.util.Log.d(org.eyeseetea.malariacare.fragments.DashboardSentFragment.TAG, ((("refreshScreen (Thread: " + (java.lang.Thread.currentThread().getId())) + "): ") + (newListSurveys.size())));
    adapter.setItems(newListSurveys);
    this.adapter.notifyDataSetChanged();
}