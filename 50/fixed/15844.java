@java.lang.Override
public boolean setActorName(java.lang.String newName, boolean not) {
    bb.chat.client.ClientChat.log.finer(("Renaming Clients Local Actor to " + newName));
    name = newName;
    return true;
}