@java.lang.Override
public void onBindViewHolder(com.theraytar.ungkyrkja.adapters.RecyclerAdapter.EntryListRowHolder EntryListRowHolder, int i) {
    com.theraytar.ungkyrkja.other.UKEntry entry = entries.get(i);
    java.util.Date date = entry.getDate();
    EntryListRowHolder.date.setText((((date.getDate()) + ". ") + (months[date.getMonth()])));
    EntryListRowHolder.content.setText(entry.getContent());
}