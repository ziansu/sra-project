@java.lang.Override
public boolean hasNext() {
    return (current) < (((end) + (se.tre.freki.storage.cassandra.BaseTimes.BASE_TIME_PERIOD)) - 1);
}