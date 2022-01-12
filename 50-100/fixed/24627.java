@im.actor.runtime.annotations.Verified
private void onUserDescChanged(im.actor.core.entity.User u) {
    context().getMessagesModule().getDialogsActor().send(new im.actor.core.modules.messaging.dialogs.DialogsActor.UserChanged(u));
    context().getContactsModule().getContactSyncActor().send(new im.actor.core.modules.contacts.ContactsSyncActor.UserChanged(u));
}