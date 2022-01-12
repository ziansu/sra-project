public void deleteUserById(java.lang.String id) throws com.insframe.server.error.UserAccessException {
    if ((userRepository.findById(id)) == null)
        throw new com.insframe.server.error.UserAccessException(com.insframe.server.error.UserAccessException.USERID_NOT_FOUND, com.insframe.server.error.UserAccessException.USERID_NOT_FOUND_ERRORCODE, new java.lang.String[]{ id });
    
    try {
        if ((assignmentService.findByUserId(id).size()) > 0)
            throw new com.insframe.server.error.UserAccessException(com.insframe.server.error.UserAccessException.USER_ASSIGNED_IN_ASSIGNMENTS, com.insframe.server.error.UserAccessException.USER_ASSIGNED_IN_ASSIGNMENTS_ERRORCODE, new java.lang.String[]{ id });
        
    } catch (com.insframe.server.error.AssignmentAccessException e) {
        userRepository.deleteUserById(id);
    }
    userRepository.deleteUserById(id);
}