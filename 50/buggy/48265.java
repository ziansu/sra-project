@java.lang.Override
public void deleteAll() {
    ebean().delete(q());
}