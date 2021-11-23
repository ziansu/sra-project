@java.lang.Override
public void start() {
    foam.dao.MapDAO dao = new foam.dao.MapDAO();
    dao.setOf(foam.nanos.pm.PMInfo.getOwnClassInfo());
    dao.setX(getX());
    getX().put("pminfodao", dao);
}