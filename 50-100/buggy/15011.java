@java.lang.Override
public void run(org.telegram.messenger.TLObject response, org.telegram.messenger.TLRPC.TL_error error) {
    if (error == null) {
        final TLRPC.messages_Messages res = ((TLRPC.messages_Messages) (response));
        processLoadedMessages(res, dialog_id, offset, count, max_id, false, classGuid, 0, 0, 0, 0, false);
    }
}