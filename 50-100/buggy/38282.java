@javafx.fxml.FXML
private void deleteMember() {
    java.lang.String memberToDelete = new java.lang.String();
    memberToDelete = members.getSelectionModel().getSelectedItem();
    java.lang.System.out.println("I'm deleting a member");
    java.lang.System.out.println(memberToDelete);
    java.util.ArrayList<java.lang.String> members = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String member : memberList) {
        if (member != memberToDelete) {
            members.add(member);
        }
    }
    group.getValue().setMembers(members);
    updateMemberList();
    updateInvitableMemberList();
}