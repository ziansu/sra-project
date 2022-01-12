@java.lang.Override
public void loadData(boolean startup) {
    java.util.ArrayList<com.ywwxhz.entitys.HotCommentItem> items = com.ywwxhz.lib.kits.FileCacheKit.getInstance().getAsObject(((getTypeKey().hashCode()) + ""), "list", new com.google.gson.reflect.TypeToken<java.util.ArrayList<com.ywwxhz.entitys.HotCommentItem>>() {    });
    if (items != null) {
        getAdapter().setDataSet(items);
        getAdapter().notifyDataSetChanged();
    }
    this.current = 1;
}