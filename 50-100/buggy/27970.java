@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    swipeRefreshLayout.setRefreshing(false);
    if (result == null) {
        android.widget.Toast.makeText(getActivity(), "No Server Update", Toast.LENGTH_SHORT).show();
    }else {
        java.util.ArrayList<fhtw.bsa2.gafert_steiner.ue4_restservice.bloodpressure.BloodPressure> mListElements = fhtw.bsa2.gafert_steiner.ue4_restservice.bloodpressure.BloodpressureParser.parseJsonString(result);
        if (mListElements != null) {
            setupChart(mListElements);
        }
    }
}