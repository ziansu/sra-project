@java.lang.Override
public void onItemClick(android.view.View v, int position) {
    android.widget.Toast.makeText(mActivity, mMyChannleList.get(position), Toast.LENGTH_SHORT).show();
}