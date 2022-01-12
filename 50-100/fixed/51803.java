@org.jclouds.json.SerializedNames(value = { "id" , "name" , "type" , "location" , "tags" , "properties" })
public static org.jclouds.azurecompute.arm.domain.VirtualMachine create(final java.lang.String id, final java.lang.String name, final java.lang.String type, final java.lang.String location, @org.jclouds.javax.annotation.Nullable
final java.util.Map<java.lang.String, java.lang.String> tags, org.jclouds.azurecompute.arm.domain.VirtualMachineProperties properties) {
    return new org.jclouds.azurecompute.arm.domain.AutoValue_VirtualMachine(id, name, type, location, (tags == null ? null : com.google.common.collect.ImmutableMap.copyOf(tags)), properties);
}