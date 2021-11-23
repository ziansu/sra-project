public java.lang.Boolean authenicateUser(java.lang.String sessionId, java.lang.String roleName) throws java.lang.Exception {
    if ((com.mastek.topcoders.smartkanteen.service.UserServiceImpl.userSessionMap.containsKey(sessionId)) && (roleName != null)) {
        com.mastek.topcoders.smartkanteen.bean.UserSession userSession = com.mastek.topcoders.smartkanteen.service.UserServiceImpl.userSessionMap.get(sessionId);
        roleName = roleName.trim().toLowerCase();
        if (com.mastek.topcoders.smartkanteen.service.UserServiceImpl.roleNameIdMap.containsKey(roleName)) {
            int roleId = com.mastek.topcoders.smartkanteen.service.UserServiceImpl.roleNameIdMap.get(roleName);
            if (roleId == (userSession.getRole())) {
                return true;
            }
        }
    }
    return false;
}