@java.lang.Override
protected void publishResults(java.lang.CharSequence charSequence, cn.ieclipse.af.adapter.FilterResults filterResults) {
    java.util.List<T> list = ((java.util.List<T>) (filterResults.values));
    if ((baseAdapter) != null) {
        baseAdapter.setDataList(list);
        baseAdapter.notifyDataSetChanged();
    }
    if ((recyclerAdapter) != null) {
        recyclerAdapter.setDataList(list);
        recyclerAdapter.notifyDataSetChanged();
    }
}