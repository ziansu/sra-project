private void resetOrder(java.util.List<lento.me.dragsetting.Item> items) {
    android.util.Log.d(lento.me.dragsetting.ItemAdapter.TAG, "-------begin to resetOrder---------");
    for (int i = 0; i < (items.size()); i++) {
        final lento.me.dragsetting.Item item = items.get(i);
        item.order = i;
        android.util.Log.d(lento.me.dragsetting.ItemAdapter.TAG, ((((("i = " + i) + ", item : desc = ") + (item.desc)) + ", order = ") + (item.order)));
    }
}