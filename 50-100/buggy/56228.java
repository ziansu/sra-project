@java.lang.Override
public void requestMoreBacklog(int bufferId, int amount) {
    android.util.Log.d("libquassel", ((("request more backlog for id " + bufferId) + ": ") + amount));
    de.kuschku.libquassel.message.Message last;
    if ((storage.getUnfiltered(bufferId).isEmpty()) || (null == (last = storage.getUnfiltered(bufferId).last())))
        requestBacklogInitial(bufferId, amount);
    else {
        requestBacklog(bufferId, (-1), last.messageId, amount, 0);
    }
}