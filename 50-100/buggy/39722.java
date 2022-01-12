@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    try {
        chatManager.deleteChats();
        updatevalues();
        adapter.refreshEvents(contactName, message, dateMessage, chatId, contactId, status, typeMessage, noReadMsgs, imgId);
    } catch (com.bitdubai.fermat_cht_api.all_definition.exceptions.CantDeleteChatException e) {
        errorManager.reportUnexpectedSubAppException(SubApps.CHT_CHAT, UnexpectedSubAppExceptionSeverity.DISABLES_SOME_FUNCTIONALITY_WITHIN_THIS_FRAGMENT, e);
    } catch (java.lang.Exception e) {
        errorManager.reportUnexpectedSubAppException(SubApps.CHT_CHAT, UnexpectedSubAppExceptionSeverity.DISABLES_SOME_FUNCTIONALITY_WITHIN_THIS_FRAGMENT, e);
    }
}