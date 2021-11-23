@java.lang.Override
public void onBindViewHolder(edu.aku.hassannaqvi.dss_census.activities.FamilyMembersActivity.familyMembersAdapter.MyViewHolder holder, int position) {
    edu.aku.hassannaqvi.dss_census.contracts.MembersContract familyMembers = MainApp.familyMembersList.get(position);
    holder.memberName.setText(familyMembers.getName().toUpperCase());
    if (familyMembers.getDss_id_member().contains("")) {
        holder.DSSidm.setText("New Member");
    }else {
        holder.DSSidm.setText(familyMembers.getDss_id_member());
    }
    holder.currentStatus.setText(familyMembers.getCurrent_status());
    holder.year.setText(familyMembers.getDob());
}