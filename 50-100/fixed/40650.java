@java.lang.Override
public boolean saveCurrencyPair(beans.CurrencyPair cp) throws java.rmi.RemoteException {
    java.lang.String sql = (((" quoting_currency = '" + (cp.getQuoting_currency())) + "' and primary_currency = '") + (cp.getPrimary_currency())) + "'";
    beans.CurrencyPair cp1 = null;
    if (cp1 != null)
        return false;
    
    return false;
}