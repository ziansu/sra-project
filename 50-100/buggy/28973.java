@java.lang.Override
public java.lang.Comparable getValue(javax.management.MBeanServerConnection mBeanServerConnection, javax.management.ObjectName objectName) throws java.io.IOException, javax.management.AttributeNotFoundException, javax.management.InstanceNotFoundException, javax.management.MBeanException, javax.management.ReflectionException {
    return ((java.lang.Comparable) (mBeanServerConnection.invoke(objectName, methodName, java.util.Arrays.stream(args).map(Typeable::getObject).toArray(java.lang.Object[]::new), getSignatures())));
}