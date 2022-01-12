public void setValue(java.util.ArrayList<MailSystemUtilities.Email> newMailList) {
    mailList = newMailList;
    table = new java.lang.Object[mailList.size()][];
    for (int i = 0; i < (mailList.size()); i++) {
        table[i] = mailList.get(i).toObjectArray();
    }
    setChanged();
    notifyObservers(mailList);
}