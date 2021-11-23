@java.lang.Override
public long count() {
    com.mongodb.DBCollection dbc1 = dBCollection();
    return dbc1.count();
}