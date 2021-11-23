public java.lang.String transactionHistoryNDays(java.lang.String accNo, int days) {
    queryClientToken(getWebTarget()).path(APIConstants.TRANSACTION_HISTORY_N_DAYS_STR).queryParam(APIConstants.ACCOUNT_NUMBER_STR, java.lang.String.valueOf(accNo)).queryParam(APIConstants.NUMBER_OF_DAYS, java.lang.Integer.valueOf(days)).request().accept(MediaType.APPLICATION_JSON_TYPE).get();
    return getDummyResponseArray(com.magus.backend.model.DummyReponses.getTransactionSummaryNDays());
}