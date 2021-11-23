public java.lang.String addNewGroup(com.example.admin.myapplication.model.entities.Group group) {
    addNewGroupToLocal(group);
    return com.example.admin.myapplication.controller.database.remote.GroupsDB.getInstance().addNewGroup(group);
}