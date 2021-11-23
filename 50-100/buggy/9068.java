public void updateStudentGroup(java.lang.Long pyramusId) {
    fi.pyramus.rest.model.StudentGroup studentGroup = pyramusClient.get().get(java.lang.String.format("/students/studentGroups/%d", pyramusId), fi.pyramus.rest.model.StudentGroup.class);
    java.lang.String identifier = identifierMapper.getStudentGroupIdentifier(pyramusId);
    fi.muikku.model.users.UserGroupEntity userGroupEntity = userGroupEntityController.findUserGroupEntityByDataSourceAndIdentifier(SchoolDataPyramusPluginDescriptor.SCHOOL_DATA_SOURCE, identifier);
    if (studentGroup == null) {
        if (userGroupEntity != null)
            fireUserGroupRemoved(identifier);
        
    }else {
        if (userGroupEntity == null) {
            fireUserGroupDiscovered(identifier);
        }else {
            fireUserGroupUpdated(identifier);
        }
    }
}