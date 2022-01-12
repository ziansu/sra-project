@java.lang.Override
public void onAdapterAboutToEmpty(int itemsInAdapter) {
    if (itemsInAdapter == 0) {
        customAdapter.items = new java.util.LinkedList<java.lang.String>(java.util.Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));
        customAdapter.notifyDataSetChanged();
    }
}