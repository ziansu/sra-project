@java.lang.Override
protected void doStop() {
    de.uniluebeck.itm.tr.iwsn.portal.ReservationManagerImpl.log.trace("ReservationManagerImpl.doStop()");
    try {
        for (de.uniluebeck.itm.tr.iwsn.portal.Reservation reservation : cache.getAll()) {
            reservation.stopAndWait();
        }
        cache.clear();
        cache.stopAndWait();
        rsPersistence.get().removeListener(rsPersistenceListener);
        schedulerService.stopAndWait();
        notifyStopped();
    } catch (java.lang.Exception e) {
        notifyFailed(e);
    }
}