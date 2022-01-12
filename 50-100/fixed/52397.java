@java.lang.Override
public void onBindViewHolder(com.nest.calamitycontrol.TimelineActivity.RVAdapter.Holder holder, int position) {
    holder.name.setText(dataModelArrayList.get(position).getName());
    holder.desc.setText(dataModelArrayList.get(position).getDesc());
    holder.place.setText(dataModelArrayList.get(position).getPlace());
    holder.time.setText(dataModelArrayList.get(position).getTime());
}