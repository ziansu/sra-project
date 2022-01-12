public java.util.List<taxiservice.payments.models.PaymentsHistory> getPaymentsForClients(long clientId) throws taxiservice.payments.exceptions.NonExistingClientException {
    openSession();
    taxiservice.payments.models.Wallet clientWallet = getClientWallet(clientId);
    java.lang.String hql = "FROM PaymentsHistory WHERE wallet =" + (clientWallet.getId());
    org.hibernate.Query query = session.createQuery(hql);
    java.util.List<taxiservice.payments.models.PaymentsHistory> result = query.list();
    closeSession();
    return result;
}