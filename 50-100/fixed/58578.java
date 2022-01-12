public java.util.List<com.insframe.server.model.Assignment> findByUserId(java.lang.String userId) throws com.insframe.server.error.AssignmentAccessException, com.insframe.server.error.UserAccessException {
    java.util.List<com.insframe.server.model.Assignment> assignments = assignmentRepository.findByUserId(new org.bson.types.ObjectId(userId));
    if ((assignments == null) || ((assignments.size()) == 0)) {
        throw new com.insframe.server.error.AssignmentAccessException(com.insframe.server.error.AssignmentAccessException.NO_OBJECTS_BY_USER_ID_FOUND_TEXT_ID, com.insframe.server.error.AssignmentAccessException.NO_OBJECTS_BY_USER_ID_FOUND_ERRORCODE, new java.lang.String[]{ userId });
    }
    return filterByLoginUser(assignments);
}