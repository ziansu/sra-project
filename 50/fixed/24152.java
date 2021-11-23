@java.lang.Override
public boolean apply(com.netflix.priam.identity.PriamInstance instance) {
    return !(instance.getInstanceId().equalsIgnoreCase(com.netflix.priam.identity.InstanceIdentity.DUMMY_INSTANCE_ID));
}