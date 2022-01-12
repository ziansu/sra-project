@java.lang.Override
public void onViewStateRestored(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewStateRestored(savedInstanceState);
    if (savedInstanceState != null) {
        mSelectedItems = savedInstanceState.getBooleanArray("selected_items");
        assert (mSelectedItems) != null;
        android.util.Log.e("ONVIEWRESTORED", (" " + (mSelectedItems[0])));
        isSelected = new java.util.ArrayList<>();
        for (int i = 0; i < (list.size()); i++) {
            isSelected.add(mSelectedItems[i]);
        }
    }
}