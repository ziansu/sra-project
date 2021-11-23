@java.lang.Override
public void process(com.datastax.driver.core.Row row, int seqNum) {
    if (processed.contains(seqNum))
        return ;
    
    processed.add(seqNum);
    process(row);
}