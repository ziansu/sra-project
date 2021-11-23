@java.lang.Override
public <T> void update(T t) {
    java.lang.System.out.println(session);
    session.save(t);
}