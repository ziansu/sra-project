@java.lang.Override
protected void publishResults(java.lang.CharSequence constraint, com.colmcoughlan.colm.alchemy.FilterResults results) {
    filteredList = ((java.util.List<com.colmcoughlan.colm.alchemy.Charity>) (results.values));
    android.util.Log.d("published: ", ("> " + (filteredList.get(0).getName())));
    android.util.Log.d("published size: ", ("> " + (filteredList.size())));
    notifyDataSetChanged();
}