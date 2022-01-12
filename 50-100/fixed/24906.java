@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    me.lensevents.dto.GroupDto groupDto = dataSnapshot.getValue(me.lensevents.dto.GroupDto.class);
    java.util.List<java.lang.String> members = groupDto.getMembers();
    if (members == null) {
        members = new java.util.ArrayList<java.lang.String>();
    }
    members.add(principal.getUid());
    java.util.Map<java.lang.String, java.lang.Object> map = new android.support.v4.util.ArrayMap();
    map.put("members", members);
    query.updateChildren(map);
}