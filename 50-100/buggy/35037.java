@java.lang.Override
public void run() {
    running.set(true);
    try {
        final java.util.List<com.bt4vt.repository.model.BusModel> buses = transitRepository.getBusLocations(route);
        for (com.bt4vt.repository.listener.BusListener busListener : busListeners) {
            busListener.onUpdateBuses(buses);
        }
    } catch (com.bt4vt.repository.exception.TransitRepositoryException e) {
        e.printStackTrace();
    } finally {
        running.set(false);
        lock.lock();
        try {
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}