@java.lang.Override
public java.util.List<org.cgiar.ccafs.marlo.data.model.LiaisonInstitution> findAll() {
    java.lang.String query = "from " + (org.cgiar.ccafs.marlo.data.model.LiaisonInstitution.class.getName());
    java.util.List<org.cgiar.ccafs.marlo.data.model.LiaisonInstitution> list = dao.findAll(query);
    if ((list.size()) > 0) {
        return list;
    }
    return null;
}