@java.lang.Override
@com.peterphi.std.guice.database.annotation.Transactional
public T merge(T obj) {
    return ((T) (getWriteSession().merge(obj)));
}