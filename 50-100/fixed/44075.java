@java.lang.Override
protected void publishResults(java.lang.CharSequence constraint, de.blau.android.util.FilterResults results) {
    if ((results != null) && ((results.count) > 0)) {
        java.util.ArrayList<de.blau.android.names.Names.NameAndTags> filteredList = ((java.util.ArrayList<de.blau.android.names.Names.NameAndTags>) (results.values));
        clear();
        for (de.blau.android.names.Names.NameAndTags c : filteredList) {
            add(c);
        }
        notifyDataSetChanged();
    }
}