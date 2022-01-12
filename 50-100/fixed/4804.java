@java.lang.Override
protected void onPostExecute(java.util.List<de.uulm.dbis.coaster2go.data.Attraction> attractionList) {
    if (attractionList == null) {
        android.util.Log.e(de.uulm.dbis.coaster2go.activities.AttractionOverviewActivity.TAG, "LoadParksTask.onPostExecute: parkList was null!");
    }else {
        attractionListAdapter.setAttractionList(attractionList);
        attractionListAdapter.notifyItemRangeInserted(0, attractionList.size());
    }
    ((de.uulm.dbis.coaster2go.activities.AttractionOverviewActivity) (getActivity())).progressBar.hide();
    ((de.uulm.dbis.coaster2go.activities.AttractionOverviewActivity) (getActivity())).progressBar.hide();
}