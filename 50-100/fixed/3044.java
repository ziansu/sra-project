public com.questdb.ql.Record get(com.questdb.ql.Record master) {
    com.questdb.ql.impl.map.MapValues values = getByMaster(master);
    if ((values == null) || ((values.get(1)) == 1)) {
        return null;
    }
    values.putByte(1, ((byte) (1)));
    return slaveCursor.recordAt(values.getLong(0));
}