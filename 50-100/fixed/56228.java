@java.lang.Override
public void requestMoreBacklog(int bufferId, int amount) {
    de.kuschku.libquassel.message.Message last;
    if ((storage.getUnfiltered(bufferId).isEmpty()) || (null == (last = storage.getUnfiltered(bufferId).last())))
        requestBacklogInitial(bufferId, amount);
    else {
        requestBacklog(bufferId, (-1), last.messageId, amount, 0);
    }
}