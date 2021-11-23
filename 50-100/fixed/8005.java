@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent resultIntent) {
    super.onActivityResult(requestCode, resultCode, resultIntent);
    switch (requestCode) {
        case diy.uigeneric.sample.SampleListActivity.REQUEST_ADD :
            if (resultCode == (android.app.Activity.RESULT_OK)) {
                loadData();
                listView.getAdapter().notifyDataSetChanged();
            }
            break;
        case diy.uigeneric.sample.SampleListActivity.REQUEST_VIEW :
            if (resultCode == (android.app.Activity.RESULT_OK)) {
                loadData();
                listView.getAdapter().notifyDataSetChanged();
            }
            break;
    }
}