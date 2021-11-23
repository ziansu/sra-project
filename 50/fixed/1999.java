@java.lang.Override
public java.util.Collection selectCurrencyPair(beans.CurrencyPair cp) throws java.rmi.RemoteException {
    java.lang.String sql = (" quoting_currency = '" + (cp.getQuoting_currency())) + "'";
    return null;
}