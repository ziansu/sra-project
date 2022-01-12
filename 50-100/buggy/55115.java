@java.lang.Override
public void remove(org.phoenixframework.channels.Channel channel) {
    synchronized(channels) {
        for (final java.util.Iterator chanIter = channels.iterator(); chanIter.hasNext();) {
            if ((chanIter.next()) == channel) {
                chanIter.remove();
                break;
            }
        }
    }
}