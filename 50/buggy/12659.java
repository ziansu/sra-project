@java.lang.Override
public void onChildRemoved(com.google.firebase.database.DataSnapshot dataSnapshot) {
    int groupIndex = getGroupIndexByKey(dataSnapshot.getKey());
    com.example.admin.myapplication.model.entities.Group removedGroup = com.example.admin.myapplication.controller.database.remote.UserGroupsDB.groups.remove(groupIndex);
    handler.onObjectReceived(removedGroup);
}