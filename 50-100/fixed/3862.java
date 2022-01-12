@java.lang.Override
public io.openmessaging.Message poll() {
    if (((bucketList.size()) == 0) || ((queue) == null)) {
        return null;
    }
    for (int i = 0; i < (bucketList.size()); i++) {
        io.openmessaging.Message message = messageStore.pullMessage(queue, bucketList.get(i));
        if (message != null) {
            return message;
        }
    }
    return null;
}