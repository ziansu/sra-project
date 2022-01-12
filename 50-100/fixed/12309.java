@java.lang.Override
public void onBindViewHolder(org.creativecommons.thelist.adapters.FeedAdapter.FeedViewholder holder, int position) {
    org.creativecommons.thelist.adapters.MainListItem l = listItems.get(position);
    holder.itemView.setVisibility(View.VISIBLE);
    holder.nameLabel.setText(l.getItemName());
    holder.makerLabel.setText(("requested by " + (l.getMakerName())));
    switch (getItemViewType(position)) {
        case org.creativecommons.thelist.adapters.FeedAdapter.ERROR_VIEW :
            holder.iconImageView.setImageResource(R.drawable.ic_error_red_24dp);
            break;
        case org.creativecommons.thelist.adapters.FeedAdapter.DEFAULT_VIEW :
            holder.iconImageView.setImageResource(R.drawable.ic_camera_alt_grey600_24dp);
            break;
    }
    holder.itemView.setTag(l);
}