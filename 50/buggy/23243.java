@java.lang.Override
public void onItemClear() {
    recyclerViewItem.setScaleY(1.0F);
    canPullDown = true;
    android.util.Log.d("mmga", "canPullDownTrue");
}