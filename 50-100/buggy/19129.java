@java.lang.Override
public void onAdapterAboutToEmpty(int itemsInAdapter) {
    if (itemsInAdapter == 2) {
        customAdapter.items.clear();
        customAdapter.notifyDataSetChanged();
        customAdapter.items.addAll(java.util.Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));
        customAdapter.notifyDataSetChanged();
    }
}