@java.lang.Override
public void onBindViewHolder(com.wow.wowmeet.partials.list.EventListAdapter.EventListViewHolder holder, int position) {
    com.wow.wowmeet.models.Event event = eventList.get(position);
    holder.textViewPlaceName.setText(event.getLocation().getName());
    holder.textViewProfileName.setText(event.getCreator().getEmail());
    holder.textViewType.setText(event.getType());
    holder.textViewDate.setText(event.getCreatedAt());
}