@java.lang.Override
public void updatePortfolio(ca.riveros.ib.Contract contract, int position, double marketPrice, double marketValue, double averageCost, double unrealizedPNL, double realizedPNL, java.lang.String accountName) {
    java.lang.System.out.println(((((((("SYMBOL : " + (contract.m_symbol)) + " CONTRACT : ") + (contract.m_conId)) + " ACCOUNT ") + accountName) + " AT EXCHANGE ") + (contract.m_exchange)));
    client.reqContractDetails(tickerId, contract);
    (tickerId)++;
}