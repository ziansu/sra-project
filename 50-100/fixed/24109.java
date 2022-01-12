@com.fasterxml.jackson.annotation.JsonIgnore
public org.votingsystem.model.currency.CurrencyBatch getCurrencyBatch() throws java.lang.Exception {
    org.votingsystem.model.currency.CurrencyBatch currencyBatch = new org.votingsystem.model.currency.CurrencyBatch();
    currencyBatch.setSubject(subject);
    currencyBatch.setToUserIBAN(toUserIBAN);
    currencyBatch.setBatchAmount(batchAmount);
    currencyBatch.setCurrencyAmount(currencyAmount);
    currencyBatch.setCurrencyCode(currencyCode);
    currencyBatch.setTagVS(new org.votingsystem.model.TagVS(tag));
    currencyBatch.setCurrencyList(currencyList);
    currencyBatch.setTimeLimited(getTimeLimited());
    currencyBatch.setBatchUUID(batchUUID);
    return currencyBatch;
}