public int compareTo(telemetry.Frame f) {
    if (((sequenceNumber) == (f.sequenceNumber)) && ((foxId) == (f.foxId)))
        return 0;
    else
        if ((sequenceNumber) < (f.sequenceNumber))
            return -1;
        else
            if ((sequenceNumber) > (f.sequenceNumber))
                return +1;
            else
                if ((sequenceNumber) == (f.sequenceNumber))
                    if ((foxId) < (f.foxId))
                        return -1;
                    
                
            
        
    
    return +1;
}