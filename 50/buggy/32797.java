public void addTransaction(com.abm.pos.ABMPos.dao.TransactionDao transactionDao) {
    transactionRepository.save(transactionDao);
    if ((null != transactionDao) && (null != (transactionDao.getPaymentDao()))) {
        paymentRepository.save(transactionDao.getPaymentDao());
    }
}