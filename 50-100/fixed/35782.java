@java.lang.Override
public void onBindViewHolder(com.createchance.doorgod.adapter.AppAdapter.ViewHolder holder, int position) {
    com.createchance.doorgod.adapter.AppInfo info = appInfoList.get(position);
    holder.appIconView.setImageDrawable(info.getAppIcon());
    holder.appNameView.setText(info.getAppName());
    holder.appPackageNameView.setText(info.getAppPackageName());
    if (protectedAppList.contains(info.getAppPackageName())) {
        holder.appCheckedView.setChecked(true);
    }else {
        holder.appCheckedView.setChecked(false);
    }
}