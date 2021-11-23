private void createOrderMulticast(ExtendMessage received_message) {
    ExtendMessage order = new ExtendMessage(received_message.getSender(), (((received_message.getText()) + "/") + (java.lang.String.valueOf(Sg))), received_message.getIdNumber(), ExtendMessage.TYPE_SEQ_ORDER, createClockMessage());
    multicast(order);
    Sg = (Sg) + 1;
}