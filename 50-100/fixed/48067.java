public pl.com.itsense.eventprocessing.consumer.sql.SQLTuple insert(final pl.com.itsense.eventprocessing.provider.rexpression.RExpressionEvent event) {
    final pl.com.itsense.eventprocessing.consumer.sql.SQLTuple tuple = new pl.com.itsense.eventprocessing.consumer.sql.SQLTuple(this, ((recordCount)++), event);
    tuples.add(tuple);
    for (final pl.com.itsense.eventprocessing.consumer.sql.SQLTable table : references) {
        if ((waiting.get(table)) == null) {
            waiting.put(table, tuple);
        }
    }
    return tuple;
}