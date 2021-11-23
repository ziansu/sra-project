public void setCrossReferences(final pl.com.itsense.eventprocessing.consumer.sql.SQLTuple tuple) {
    final pl.com.itsense.eventprocessing.consumer.sql.SQLTuple t = waiting.get(tuple.getTable());
    if ((t != null) && (tuple != t)) {
        t.setReference(tuple);
        waiting.put(tuple.getTable(), next(t));
        if (isComplete(t)) {
            save(t);
        }
    }
}