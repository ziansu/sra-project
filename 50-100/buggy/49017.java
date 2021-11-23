@java.lang.Override
protected void publishResults(java.lang.CharSequence constraint, com.prince.custommap.FilterResults results) {
    if ((results != null) && ((results.count) > 0)) {
        mResultList = ((java.util.ArrayList<com.prince.custommap.AutoCompleteAdapter.PlaceAutoComplete>) (results.values));
        notifyDataSetChanged();
    }else {
        clearList();
    }
}