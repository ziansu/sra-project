public void refreshScreen(java.util.List<org.eyeseetea.malariacare.data.database.model.Survey> newListSurveys) {
    android.util.Log.d(org.eyeseetea.malariacare.fragments.DashboardSentFragment.TAG, ((("refreshScreen (Thread: " + (java.lang.Thread.currentThread().getId())) + "): ") + (newListSurveys.size())));
    this.surveys.addAll(newListSurveys);
    adapter.setItems(newListSurveys);
    this.adapter.notifyDataSetChanged();
}