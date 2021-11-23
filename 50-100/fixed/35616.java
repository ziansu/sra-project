@java.lang.Override
public void onBindViewHolder(com.example.bashim.adapter.LikedRecordingsAdapter.ViewHolder holder, int position) {
    recordings = mDataset.get(position);
    holder.text.setText(mDataset.get(position).getHtml());
    holder.imageButtonRemoved.setTag(mDataset.get(position).getId());
}