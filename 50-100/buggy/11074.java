@java.lang.Override
protected void publishResults(java.lang.CharSequence constraint, com.alex.develop.adapter.FilterResults results) {
    android.util.Log.d("Select", ((constraint + ", ") + (results.count)));
    stocks = ((java.util.List<com.alex.develop.adapter.Stock>) (results.values));
    if (0 < (results.count)) {
        notifyDataSetChanged();
    }else {
        notifyDataSetInvalidated();
    }
    mListener.find(results.count);
}