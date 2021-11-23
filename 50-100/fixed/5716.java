public void retrieveTransaction(com.bank.bean.account.AccountBean sourceAccountBean, double amount, java.lang.String comment) {
    com.bank.bean.transaction.TransactionBean transactionBean = new com.bank.bean.transaction.TransactionBean();
    transactionBean.setSourceBean(sourceAccountBean);
    transactionBean.setAmount(amount);
    transactionBean.setComment(comment);
    transactionRepository.save(transactionBean);
    accountUpdateAmountService.updateAmount(sourceAccountBean.getAccountId(), (-amount));
}