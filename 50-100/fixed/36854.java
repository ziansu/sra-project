public java.util.List<org.infoscoop.dao.model.Notification> getMyNotifications(int offset, int limit, java.util.Date startDate) {
    org.infoscoop.acl.ISPrincipal p = org.infoscoop.acl.SecurityController.getPrincipalByType("UIDPrincipal");
    java.lang.String uid = p.getName();
    java.util.List<java.lang.String> serviceIds = squareDAO.getParentSquaresIDByUid(uid);
    if ((serviceIds.size()) == 0)
        return new java.util.ArrayList<org.infoscoop.dao.model.Notification>();
    
    return notificationDAO.select(offset, limit, startDate, serviceIds);
}