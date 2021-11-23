@java.lang.Override
public void onClick(android.view.View view) {
    currentShotObjList.clear();
    dribbbleAdapter.notifyDataSetChanged();
    retrieveDataFromAPi();
}