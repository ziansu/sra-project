@java.lang.Override
public void onBindViewHolder(cz.zcu.fav.remotestimulatorcontrol.ui.configurations.ConfigurationAdapter.ConfigurationHolder holder, int position) {
    cz.zcu.fav.remotestimulatorcontrol.model.configuration.AConfiguration configuration = mConfigurations.get(position);
    holder.bindTo(configuration);
    boolean selected = mSelectedItems.get(position, false);
    holder.itemView.setSelected(selected);
    holder.setIsRecyclable((!selected));
}