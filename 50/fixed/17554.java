public synchronized void select(java.lang.String messageId) {
    selectNew(messageId);
    notifyItemChanged(getItemPosition(messageId));
}