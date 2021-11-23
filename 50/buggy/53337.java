public org.md2k.datakitapi.status.Status add(org.md2k.datakit.datarouter.MessageSubscriber subscriber) {
    org.md2k.utilities.Report.Log.d(org.md2k.datakit.datarouter.Publisher.TAG, "Publisher->add()");
    if (isExists(subscriber))
        return new org.md2k.datakitapi.status.Status(org.md2k.datakitapi.status.StatusCodes.ALREADY_SUBSCRIBED);
    
    messageSubscribers.add(subscriber);
    return new org.md2k.datakitapi.status.Status(org.md2k.datakitapi.status.StatusCodes.SUCCESS);
}