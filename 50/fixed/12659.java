@java.lang.Override
public void onChildRemoved(com.google.firebase.database.DataSnapshot dataSnapshot) {
    java.lang.Integer groupIndex = getGroupIndexByKey(dataSnapshot.getKey());
    if (groupIndex != null) {
        com.example.admin.myapplication.model.entities.Group removedGroup = com.example.admin.myapplication.controller.database.remote.UserGroupsDB.groups.remove(groupIndex.intValue());
        handler.onObjectReceived(removedGroup);
    }
}