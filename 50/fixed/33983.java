@java.lang.Override
public void onClick(android.view.View view) {
    if ((currentShotObjList) != null) {
        currentShotObjList.clear();
        dribbbleAdapter.notifyDataSetChanged();
    }
    retrieveDataFromAPi();
}