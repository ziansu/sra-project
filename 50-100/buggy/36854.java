public java.util.List<org.infoscoop.dao.model.Notification> getMyNotifications(int offset, int limit, java.util.Date startDate) {
    org.infoscoop.acl.ISPrincipal p = org.infoscoop.acl.SecurityController.getPrincipalByType("UIDPrincipal");
    java.lang.String uid = p.getName();
    java.util.List<java.lang.String> serviceIds = squareDAO.getParentSquaresIDByUid(uid);
    return notificationDAO.select(offset, limit, startDate, serviceIds);
}