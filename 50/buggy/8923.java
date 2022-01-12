public void addToAllFutureMsg(com.friends.stay.keepintouch.Msg m) {
    allFutureMessages.add(m);
    com.friends.stay.keepintouch.Contact contact = findContactByMsg(m);
    if (contact != null) {
        contact.getFutureMessages().add(m);
    }
}