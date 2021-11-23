@java.lang.Override
public void onTrigger(org.apache.nifi.processor.ProcessContext context, org.apache.nifi.processor.ProcessSessionFactory sessionFactory) throws org.apache.nifi.processor.exception.ProcessException {
    sessionFactoryReference.compareAndSet(null, sessionFactory);
}