public int compareTo(ldbc.snb.datagen.hadoop.UpdateEventKey key) {
    if ((date) < (key.date))
        return -1;
    
    if ((date) > (key.date))
        return 1;
    
    if ((reducerId) != (key.reducerId))
        return (reducerId) - (key.reducerId);
    
    if ((partition) != (key.partition))
        return (partition) - (key.partition);
    
    return 0;
}