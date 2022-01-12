public void setCrossReferences(final pl.com.itsense.eventprocessing.consumer.sql.SQLTuple tuple) {
    final pl.com.itsense.eventprocessing.consumer.sql.SQLTuple t = waiting.get(tuple.getTable());
    if ((t != null) && (tuple != t)) {
        t.setReference(tuple);
        if (isComplete(t)) {
            save(t);
            waiting.put(tuple.getTable(), next(t));
        }
    }
}