public void notifyAllObservers(org.md2k.datakitapi.datatype.DataType dataType) {
    if ((databaseSubscriber) != null)
        databaseSubscriber.update(ds_id, dataType);
    
    for (org.md2k.datakit.datarouter.MessageSubscriber subscriber : messageSubscribers) {
        if (!(subscriber.update(ds_id, dataType)))
            messageSubscribers.remove(subscriber);
        
    }
}