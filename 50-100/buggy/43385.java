public void updateTransactionStatusOnId(java.lang.String status, java.lang.Long transactionId, com.karma.workhistory.model.User companyUser) {
    com.karma.workhistory.model.WorkHistoryTransaction workHistoryTransaction = hibernateUtil.find(com.karma.workhistory.model.WorkHistoryTransaction.class, transactionId);
    workHistoryTransaction.setStatus(status);
    workHistoryTransaction.setApproverCompanyHr(companyUser);
    workHistoryTransaction.setChangeDate(new java.util.Date());
    hibernateUtil.update(com.karma.workhistory.model.WorkHistoryTransaction.class, workHistoryTransaction);
}