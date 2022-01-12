public boolean hasPermission(java.lang.String username, ro.msg.edu.persistence.user.entity.enums.PermissionType permissionType) {
    javax.persistence.Query query = em.createQuery("SELECT p.namePermission FROM User u INNER JOIN u.roles ur INNER JOIN ur.permissions p WHERE p.namePermission= :permission and u.username= :username");
    query.setParameter(ro.msg.edu.business.user.dao.UserDAO.USERNAME, username);
    query.setParameter("permission", permissionType);
    java.util.List<ro.msg.edu.persistence.user.entity.Permission> permissionList = query.getResultList();
    return (permissionList.isEmpty()) == false;
}