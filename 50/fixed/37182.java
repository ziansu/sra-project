@java.lang.Override
public void addAttach(java.lang.String fullName) throws java.lang.Exception {
    if (fullName != null) {
        session.insert(((web.portfolio.persistence.ProductDAOImpl.NAMESPACE) + "addAttach"), fullName);
    }
}