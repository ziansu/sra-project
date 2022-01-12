@java.lang.Override
public void onBindViewHolder(com.cse110.eventlit.OrganizationsAdapter.MyViewHolder holder, int position) {
    holder.mOrgName.setText(mOrganizations.get(position).getName());
    com.cse110.eventlit.db.User user = com.cse110.utils.UserUtils.getCurrentUser();
    java.lang.String orgId = mOrganizations.get(position).getOrgId();
    if ((user != null) && (user.isFollowingOrg(orgId))) {
        holder.mOrgName.setChecked(true);
    }else {
        holder.mOrgName.setChecked(false);
    }
}