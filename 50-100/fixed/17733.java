public int compareTo(ldbc.snb.datagen.hadoop.UpdateEventKey key) {
    if ((reducerId) != (key.reducerId))
        return (reducerId) - (key.reducerId);
    
    if ((partition) != (key.partition))
        return (partition) - (key.partition);
    
    if ((date) < (key.date))
        return -1;
    
    if ((date) > (key.date))
        return 1;
    
    return 0;
}