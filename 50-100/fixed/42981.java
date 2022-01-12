@java.lang.Override
public IdType run(org.hibernate.Session session) throws net.unikit.database.exceptions.ConstraintViolationExceptionCommon {
    BaseIdType id = null;
    try {
        id = ((BaseIdType) (session.save(entity)));
    } catch (net.unikit.database.implementations.org.hibernate e) {
        throw new net.unikit.database.exceptions.ConstraintViolationExceptionCommon(e.getCause(), entity);
    }
    return id;
}