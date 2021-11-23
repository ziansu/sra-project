@java.lang.Override
public T poll() {
    synchronized(queues) {
        if (queues.isEmpty())
            return null;
        else {
            while (true) {
                T value = queues.peekFirst().poll();
                if (value == null) {
                    if ((queues.size()) <= 1) {
                        return null;
                    }else {
                        com.github.davidmoten.rx.internal.operators.RollingQueue.Queue2<T> removed = queues.pollFirst();
                        removed.dispose();
                    }
                }else {
                    return value;
                }
            } 
        }
    }
}