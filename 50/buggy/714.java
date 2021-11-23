@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d("ZHAP", "click fab");
    if ((costList.size()) < 5) {
        createNewCostDialog();
    }
}