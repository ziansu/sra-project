public static com.hazelcast.core.HazelcastInstance getHazelcastInstance() {
    org.osgi.framework.BundleContext ctx = org.osgi.framework.FrameworkUtil.getBundle(org.wso2.carbon.ntask.core.internal.TasksDSComponent.class).getBundleContext();
    org.osgi.framework.ServiceReference<com.hazelcast.core.HazelcastInstance> ref = ctx.getServiceReference(com.hazelcast.core.HazelcastInstance.class);
    if (ref == null) {
        return null;
    }
    return ctx.getService(ref);
}