@java.lang.Override
public java.lang.String resolvePlayAlias(com.wowza.wms.application.IApplicationInstance appInstance, java.lang.String name) {
    java.lang.String streamName = name;
    java.lang.String streamExt = com.wowza.wms.stream.MediaStream.BASE_STREAM_EXT;
    if (streamName != null) {
        java.lang.String[] streamDecode = com.wowza.wms.util.ModuleUtils.decodeStreamExtension(streamName, streamExt);
        streamName = streamDecode[0];
        streamExt = streamDecode[1];
        if ((appInstance.getMediaReaderContentType(streamExt)) == (com.wowza.wms.stream.IMediaReader.CONTENTTYPE_MEDIALIST))
            return name;
        
    }
    return this.getStreamName(streamName);
}