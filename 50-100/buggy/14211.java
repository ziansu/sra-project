protected void refreshHolder(de.dreier.mytargets.utils.multiselector.SelectableHolder holder) {
    if (holder != null) {
        if (holder instanceof de.dreier.mytargets.utils.multiselector.ItemBindingHolder) {
            if ((((de.dreier.mytargets.utils.multiselector.ItemBindingHolder) (holder)).getItem()) != null) {
                ((de.dreier.mytargets.utils.multiselector.ItemBindingHolder) (holder)).bindItem();
            }
        }
        holder.setSelectable(isSelectable);
        boolean isActivated = isSelected(holder.getItemId());
        holder.setActivated(isActivated);
    }
}