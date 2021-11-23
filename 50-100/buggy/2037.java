@java.lang.Override
public java.lang.Object invoke(org.aopalliance.intercept.MethodInvocation invocation) throws java.lang.Throwable {
    com.rapid.develop.core.dal.transaction.TransactionManager.begin();
    java.lang.Object ret = null;
    try {
        ret = invocation.proceed();
    } catch (java.lang.Exception ex) {
        com.rapid.develop.core.dal.transaction.TransactionManager.rollback();
        throw ex;
    } finally {
        com.rapid.develop.core.dal.transaction.TransactionManager.commit();
    }
    return ret;
}