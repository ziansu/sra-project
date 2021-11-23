private void loadMembers(android.widget.LinearLayout membersVerticalLayout, final java.util.ArrayList<de.blau.android.osm.RelationMemberDescription> members) {
    membersVerticalLayout.removeAllViews();
    if ((members != null) && (!(members.isEmpty()))) {
        for (int i = 0; i < (members.size()); i++) {
            de.blau.android.osm.RelationMemberDescription current = members.get(i);
            insertNewMember(membersVerticalLayout, java.lang.Integer.toString(i), current, (-1), de.blau.android.propertyeditor.RelationMembersFragment.Connected.NOT, false);
        }
    }
}