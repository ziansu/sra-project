public java.util.List<taxiservice.payments.models.PaymentsHistory> getPaymentsForClients(long clientId) throws taxiservice.payments.exceptions.NonExistingClientException {
    taxiservice.payments.models.Wallet clientWallet = getClientWallet(clientId);
    openSession();
    java.lang.String hql = "FROM PaymentsHistory WHERE wallet =" + (clientWallet.getWalletid());
    org.hibernate.Query query = session.createQuery(hql);
    java.util.List<taxiservice.payments.models.PaymentsHistory> result = query.list();
    closeSession();
    return result;
}