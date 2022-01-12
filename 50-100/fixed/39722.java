@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    try {
        updatevalues();
        adapter.refreshEvents(contactName, message, dateMessage, chatId, contactId, status, typeMessage, noReadMsgs, imgId);
    } catch (java.lang.Exception e) {
        errorManager.reportUnexpectedSubAppException(SubApps.CHT_CHAT, UnexpectedSubAppExceptionSeverity.DISABLES_SOME_FUNCTIONALITY_WITHIN_THIS_FRAGMENT, e);
    }
}