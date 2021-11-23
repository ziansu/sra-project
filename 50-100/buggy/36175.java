@java.lang.Override
public void processData(uk.ac.imperial.lsds.seep.api.data.ITuple data, uk.ac.imperial.lsds.seep.api.API api) {
    if (first) {
        first = false;
        idx_userid = data.getIndexFor("userId");
        idx_value = data.getIndexFor("value");
    }
    (totalCalls)++;
    int userId = data.getInt(idx_userid);
    long value = data.getLong(idx_value);
    value = value / value;
    o.setValues(new java.lang.Object[]{ userId , value });
    api.send(o);
}