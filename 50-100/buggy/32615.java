@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
protected void publishResults(java.lang.CharSequence charSequence, com.example.jaroslavistok.personalmobileassistantformanagingdiabetes.adapters.FilterResults filterResults) {
    if ((filterResults.count) > 0) {
        clear();
        addAll(((java.util.List<com.example.jaroslavistok.personalmobileassistantformanagingdiabetes.data_entities.Record>) (filterResults.values)));
        notifyDataSetChanged();
    }else {
        notifyDataSetInvalidated();
    }
}