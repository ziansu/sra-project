@java.lang.Override
protected void publishResults(java.lang.CharSequence constraint, com.example.cesarsk.say_it.FilterResults filterResults) {
    if ((filterResults.count) > 0) {
        android.util.Log.println(Log.INFO, "Results", "FOUND");
        results.clear();
        results.addAll(((java.util.ArrayList<java.lang.String>) (filterResults.values)));
        notifyDataSetChanged();
    }else {
        android.util.Log.println(Log.INFO, "Results", "-");
        results.clear();
        notifyDataSetInvalidated();
    }
}