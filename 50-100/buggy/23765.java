@java.lang.Override
public java.util.List<org.cgiar.ccafs.marlo.data.model.CrpUser> getCrpUserByUserId(long userId) {
    java.lang.String query = (("from " + (org.cgiar.ccafs.marlo.data.model.CrpUser.class.getName())) + " where is_active=1 and user_id= ") + userId;
    java.util.List<org.cgiar.ccafs.marlo.data.model.CrpUser> list = dao.findAll(query);
    if ((list.size()) > 0) {
        return list;
    }
    return null;
}