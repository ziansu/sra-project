@java.lang.Override
public void onChildRemoved(com.google.firebase.database.DataSnapshot dataSnapshot) {
    com.dev.wacteam.taskmanager.model.Project project = dataSnapshot.getValue(com.dev.wacteam.taskmanager.model.Project.class);
    java.util.ArrayList<java.lang.String> listMember = project.getmMembers();
    if (listMember != null) {
        for (java.lang.String memId : listMember) {
            if (memId.equals(com.dev.wacteam.taskmanager.system.CurrentUser.getInstance().getUserProfileFromLocal(context).getProfile().getUid())) {
                listener.onChildRemoved(dataSnapshot);
            }
        }
    }
}