public void createTSDRTables() {
    java.lang.String cql = "CREATE TABLE MetricVal (" + (((("KeyA bigint, " + "KeyB bigint, ") + "Time bigint, ") + "value double,") + "PRIMARY KEY (KeyA,KeyB,Time))");
    this.session.execute(cql);
    cql = "CREATE TABLE MetricLog (" + ((((("KeyA bigint, " + "KeyB bigint, ") + "Time bigint, ") + "xIndex int,") + "value text,") + "PRIMARY KEY (KeyA,KeyB,Time,xIndex))");
    this.session.execute(cql);
}