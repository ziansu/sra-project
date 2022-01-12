@java.lang.Override
public void onBindViewHolder(io.shapio.impulse.adapter.IllHistoryAdapter.MyViewHolder holder, int position) {
    io.shapio.impulse.model.IllHistoryItem current = data.get(position);
    holder.diseaseName.setText(data.get(position).getDiseaseName());
    holder.date.setText(data.get(position).getDate());
}