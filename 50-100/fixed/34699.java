@lombok.SneakyThrows
@java.lang.Override
public java.lang.Object translate(java.lang.Object o) {
    if ((o.getClass()) == (com.google.gson.JsonObject.class)) {
        org.postgresql.util.PGobject pGobject = new org.postgresql.util.PGobject();
        pGobject.setType("json");
        pGobject.setValue(com.alesharik.database.postgres.PostgresDriver.GSON.toJson(((com.google.gson.JsonObject) (o))));
        return pGobject;
    }
    return o;
}