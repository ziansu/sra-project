public java.util.List<com.quickblox.chat.model.QBChatMessage> getDialogMessages(com.quickblox.core.request.QBRequestGetBuilder customObjectRequestBuilder, android.os.Bundle returnedBundle, com.quickblox.chat.model.QBDialog dialog, long lastDateLoad) throws com.quickblox.core.exception.QBResponseException {
    if (lastDateLoad != (com.quickblox.q_municate_core.utils.ConstsCore.ZERO_LONG_VALUE)) {
    }else {
        deleteMessagesByDialogId(dialog.getDialogId());
    }
    java.util.List<com.quickblox.chat.model.QBChatMessage> dialogMessagesList = com.quickblox.chat.QBChatService.getDialogMessages(dialog, customObjectRequestBuilder, returnedBundle);
    if (dialogMessagesList != null) {
        com.quickblox.q_municate_core.db.managers.ChatDatabaseManager.saveChatMessages(context, dialogMessagesList, dialog.getDialogId());
    }
    return dialogMessagesList;
}