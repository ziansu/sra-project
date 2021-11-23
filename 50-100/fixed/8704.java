@java.lang.SuppressWarnings(value = { "rawtypes" , "unchecked" })
public static com.hazelcast.core.HazelcastInstance getHazelcastInstance() {
    org.osgi.framework.BundleContext ctx = org.osgi.framework.FrameworkUtil.getBundle(org.wso2.carbon.ntask.core.internal.TasksDSComponent.class).getBundleContext();
    org.osgi.framework.ServiceReference ref = ctx.getServiceReference(com.hazelcast.core.HazelcastInstance.class);
    if (ref == null) {
        return null;
    }
    return ((com.hazelcast.core.HazelcastInstance) (ctx.getService(ref)));
}