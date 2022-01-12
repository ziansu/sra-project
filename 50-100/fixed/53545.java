private static long toEventTypeId(java.lang.String value) {
    if ("match".equals(value)) {
        return IsEventType.MATCH;
    }else
        if ("training".equals(value)) {
            return IsEventType.TRAINING;
        }else
            if ("event".equals(value)) {
                return IsEventType.EVENT;
            }else
                if ("tournament".equals(value)) {
                    return IsEventType.TOURNAMENT;
                }else {
                    return IsEventType.OTHER;
                }
            
        
    
}