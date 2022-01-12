@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<model.Client> getClientByUsername(java.lang.String username) {
    java.lang.String query = "SELECT c FROM model.Client c WHERE c.username = :custName";
    java.util.List<model.Client> matchClients = this.getEntityManager().createQuery(query).setParameter("custName", username).getResultList();
    if ((matchClients.size()) == 1) {
        java.lang.System.out.println(matchClients.get(0).getAccounts().get(0).toString());
        return matchClients;
    }
    return null;
}