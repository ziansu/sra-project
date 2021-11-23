public java.lang.Integer deleteMessage(java.util.List<com.slabs.expense.tracker.common.db.entity.Message> messages, boolean isDeleteOldMsg) throws java.lang.Exception {
    int noOfRecords = 0;
    for (com.slabs.expense.tracker.common.db.entity.Message message : messages) {
        noOfRecords = noOfRecords + (dao.deleteMessage(message, isDeleteOldMsg));
    }
    return noOfRecords;
}