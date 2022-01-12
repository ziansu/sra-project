@java.lang.Override
public void onBindViewHolder(com.oestjacobsen.android.get2gether.view.groups.GroupsActivity.GroupHolder holder, int position) {
    com.oestjacobsen.android.get2gether.model.Group group = mGroups.get(position);
    if (position >= (mPendingStartingPos)) {
        holder.bindGroup(group, position, true);
    }else {
        holder.bindGroup(group, position, false);
    }
}