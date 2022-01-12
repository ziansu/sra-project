@java.lang.Override
public org.openmrs.module.xdsbrepository.model.QueueItem dequeueNextDiscreteDataForProcessing() {
    synchronized(this) {
        org.openmrs.module.xdsbrepository.model.QueueItem qi = dao.dequeueNextDiscreteDataForProcessing();
        if (qi != null) {
            qi.setStatus(QueueItem.Status.PROCESSING);
            qi.setDateUpdated(new java.util.Date());
            return dao.updateQueueItem(qi);
        }else {
            return null;
        }
    }
}