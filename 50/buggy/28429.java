@java.lang.Override
public beans.CurrencyDefault selectCurrencyDefault(java.lang.String currencyISO) throws java.rmi.RemoteException {
    return dbSQL.CurrencyDefaultSQL.selectcurrencyDefault(currencyISO, dsSQL.getConn());
}