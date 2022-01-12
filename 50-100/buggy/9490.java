@java.lang.Override
public void onBindViewHolder(com.closestudios.bro.util.BroViewAdapter.ViewHolder holder, int position) {
    holder.flBackdrop.setBackgroundColor(holder.flBackdrop.getContext().getResources().getColor(colors[(position + ((colorOffset) % (colors.length)))]));
    holder.tvHeader.setText(mDataset[position].getHeader());
    holder.tvDetails.setText(mDataset[position].getDetails());
}