@java.lang.Override
public void onNext(com.aniruddh.kubratest.API.Utils.apiModel.apiResponse response) {
    android.util.Log.i("Tag", "Tag");
    mUsers.add(response);
    mAdapter.setList(mUsers);
    mAdapter.notifyDataSetChanged();
}