@java.lang.Override
public java.lang.String addMemberToGroup(grouper.shemmagnezi.com.grouper.pojo.Group group, grouper.shemmagnezi.com.grouper.pojo.Member member) {
    com.firebase.client.Firebase members = firebaseRef.child(((group.getId()) + "/members"));
    com.firebase.client.Firebase newMember = members.push();
    member.setId(newMember.getKey());
    newMember.setValue(member);
    return member.getId();
}