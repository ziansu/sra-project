@java.lang.Override
public V evaluate() {
    if ((value) == null)
        throw new org.eclipse.scanning.api.event.queues.models.QueueModelException("Value was never initialised");
    
    return value;
}