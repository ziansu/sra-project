@java.lang.Override
public void start() {
    foam.dao.MapDAO dao = new foam.dao.MapDAO().setOf(foam.nanos.pm.PMInfo.getOwnClassInfo()).setX(getX());
    getX().put("pminfodao", dao);
}