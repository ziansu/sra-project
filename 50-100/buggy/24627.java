@im.actor.runtime.annotations.Verified
private void onUserDescChanged(im.actor.core.entity.User u) {
    context().getMessagesModule().getDialogsActor().send(new im.actor.core.modules.messaging.dialogs.DialogsActor.UserChanged(u));
    if (context().getConfiguration().isEnabledGroupedChatList()) {
        context().getMessagesModule().getDialogsGroupedActor().send(new im.actor.core.modules.users.ActiveDialogsActor.PeerInformationChanged(im.actor.core.entity.Peer.user(u.getUid())));
    }
    context().getContactsModule().getContactSyncActor().send(new im.actor.core.modules.contacts.ContactsSyncActor.UserChanged(u));
}