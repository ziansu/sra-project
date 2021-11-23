@java.lang.Override
public boolean processNewImageLines() throws java.io.IOException, java.sql.SQLException {
    for (telemetry.SatPayloadDbStore store : payloadStore)
        if (store != null)
            if (!(store.processNewImageLines()))
                return false;
            
        
    
    return true;
}