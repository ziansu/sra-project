@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    if (holder instanceof nl.rwslinkman.hueme.ui.HueGroupsAdapter.ViewHolder) {
        nl.rwslinkman.hueme.ui.HueGroupsAdapter.ViewHolder vh = ((nl.rwslinkman.hueme.ui.HueGroupsAdapter.ViewHolder) (holder));
        if (vh.isPlaceholderView()) {
            vh.mIconView.setText(R.string.fa_exclamation_circle);
            vh.mGroupNameView.setText(R.string.groups_item_nonefound);
        }else {
            final com.philips.lighting.model.PHGroup group = mDataset.get(position);
            vh.mIconView.setText(R.string.fa_lightbulb_o);
            vh.mGroupNameView.setText(group.getName());
        }
    }
}