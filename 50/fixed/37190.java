@java.lang.Override
public void onNext(java.util.List<com.aniruddh.kubratest.API.Utils.apiModel.apiResponse> response) {
    android.util.Log.i("Tag", "Tag");
    mAdapter.setList(response);
    mAdapter.notifyDataSetChanged();
}