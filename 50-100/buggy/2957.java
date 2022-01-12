@java.lang.Override
public void _receiveBacklog(int id, int first, int last, int limit, int additional, @android.support.annotation.NonNull
java.util.List<de.kuschku.libquassel.message.Message> messages) {
    de.kuschku.util.AndroidAssert.assertNotNull(provider);
    storage.insertMessages(id, messages.toArray(new de.kuschku.libquassel.message.Message[messages.size()]));
    client.initBacklog(id);
    provider.sendEvent(new de.kuschku.libquassel.events.BacklogReceivedEvent(id));
    android.util.Log.d("libquassel", ("received backlog for id " + id));
}