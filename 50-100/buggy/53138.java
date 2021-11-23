int compareStartTime(java.time.LocalTime source, java.time.LocalTime target) {
    if ((source == null) && (target == null)) {
        return 0;
    }else
        if (source == null) {
            return -1;
        }else
            if (target == null) {
                return 1;
            }else {
                return source.compareTo(target);
            }
        
    
}