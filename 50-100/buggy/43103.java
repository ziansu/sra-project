@java.lang.Override
protected void publishResults(java.lang.CharSequence constraint, com.randomappsinc.padbuddy.Adapters.FilterResults results) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.ArrayList<java.lang.String> filteredList = ((java.util.ArrayList<java.lang.String>) (results.values));
    if ((results != null) && ((results.count) > 0)) {
        clear();
        for (java.lang.String c : filteredList) {
            add(c);
        }
        notifyDataSetChanged();
    }
}