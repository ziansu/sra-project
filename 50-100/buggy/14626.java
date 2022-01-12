@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case space.sye.z.recyclerviewmanager.MainActivity.PULL_DOWN :
            mDatas.add(0, "new Item");
            break;
        case space.sye.z.recyclerviewmanager.MainActivity.LOAD_MORE :
            for (int i = 0; i < 10; i++) {
                mDatas.add(("item" + ((counts) + i)));
            }
            counts = (counts) + 10;
            break;
    }
    recyclerView.onRefreshCompleted();
    myAdapter.notifyDataSetChanged();
}