@java.lang.Override
public void done(java.util.List<com.avos.avoscloud.AVObject> list, com.avos.avoscloud.AVException e) {
    if (e == null) {
        mList.clear();
        mList.addAll(list);
        mRecyclerAdapter.notifyDataSetChanged();
    }else {
        e.printStackTrace();
    }
}