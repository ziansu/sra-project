public void releaseStream(com.wowza.wms.client.IClient client, com.wowza.wms.request.RequestFunction function, com.wowza.wms.amf.AMFDataList params) {
    java.lang.String streamName = extractStreamName(client, function, params);
    if (!(isDuplicateStream(client, streamName)))
        invokePrevious(client, function, params);
    
    com.kaltura.media.server.wowza.listeners.LiveStreamEntry.logger.info((("Deleting duplicate stream [" + streamName) + "]"));
}