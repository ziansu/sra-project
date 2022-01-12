public synchronized java.lang.String getNextReferenceForTransaction(pl.morecraft.dev.settler.domain.Transaction transaction) {
    java.lang.String sequenceName = "T" + (((transaction.getCategories()) == null) || (transaction.getCategories().isEmpty()) ? "RNS" : transaction.getCategories().get(0).getCode());
    java.lang.Long next = getNextSequenceByName(sequenceName);
    if (next == null) {
        pl.morecraft.dev.settler.service.SequenceManager.manager.initSequence(sequenceName, 0L);
    }
    return sequenceName + (java.lang.String.format("%04d", next));
}