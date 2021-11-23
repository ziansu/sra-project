public static com.quickblox.q_municate_db.models.Message createTempLocalMessage(long messageId, com.quickblox.q_municate_db.models.DialogOccupant dialogOccupant, java.lang.String body, com.quickblox.q_municate_db.models.State state) {
    com.quickblox.q_municate_db.models.Message message = new com.quickblox.q_municate_db.models.Message();
    message.setMessageId(java.lang.String.valueOf(messageId));
    message.setDialogOccupant(dialogOccupant);
    message.setState(state);
    message.setBody(body);
    return message;
}