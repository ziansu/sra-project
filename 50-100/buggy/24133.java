public void deleteUserById(java.lang.String id) throws com.insframe.server.error.UserAccessException {
    @java.lang.SuppressWarnings(value = "unused")
    boolean noReferenceFound;
    if ((userRepository.findById(id)) == null)
        throw new com.insframe.server.error.UserAccessException(com.insframe.server.error.UserAccessException.USERID_NOT_FOUND, com.insframe.server.error.UserAccessException.USERID_NOT_FOUND_ERRORCODE, new java.lang.String[]{ id });
    
    try {
        assignmentService.findByUserId(id);
        noReferenceFound = false;
    } catch (com.insframe.server.error.AssignmentAccessException e) {
        noReferenceFound = true;
    }
    if (noReferenceFound == false)
        throw new com.insframe.server.error.UserAccessException(com.insframe.server.error.UserAccessException.USER_ASSIGNED_IN_ASSIGNMENTS, com.insframe.server.error.UserAccessException.USER_ASSIGNED_IN_ASSIGNMENTS_ERRORCODE, new java.lang.String[]{ id });
    
    userRepository.deleteUserById(id);
}