@java.lang.Override
public boolean processNewImageLines() throws java.io.IOException, java.sql.SQLException {
    for (telemetry.SatPayloadDbStore store : payloadStore)
        if (store != null)
            store.processNewImageLines();
        
    
    return true;
}