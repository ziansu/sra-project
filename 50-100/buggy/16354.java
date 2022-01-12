@java.lang.Override
public void onSuccess() {
    trip.removeMember(member);
    adapter.removeMember(member);
    updateLabelsVisibilityIfNecessary();
    android.support.design.widget.Snackbar.make(mActivity.findViewById(android.R.id.content), (member.pendingRequest ? R.string.snackbar_invitee_removed : R.string.snackbar_member_removed), Snackbar.LENGTH_SHORT).show();
}