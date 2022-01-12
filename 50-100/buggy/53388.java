private void loadMembers(android.widget.LinearLayout membersVerticalLayout, final java.util.ArrayList<de.blau.android.osm.RelationMemberDescription> members) {
    membersVerticalLayout.removeAllViews();
    if ((members != null) && ((members.size()) > 0)) {
        for (int i = 0; i < (members.size()); i++) {
            de.blau.android.osm.RelationMemberDescription current = members.get(i);
            insertNewMember(membersVerticalLayout, (i + ""), current, (-1), de.blau.android.propertyeditor.RelationMembersFragment.Connected.NOT, false);
        }
    }
}